package com.example.fetchingassessment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

class MainActivity : AppCompatActivity() {

        lateinit var postViewModel: PostViewModel{
        }


        override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView:RecyclerView=findViewById(R.id.recyclerView)
        val adapter=PostAdapter(emptyList())

        recyclerView.adapter=adapter
        recyclerView.layoutManager=LinearLayoutManager(this)

        postViewModel=ViewModelProvider(this).get(PostViewModel::class.java)


        postViewModel.posts.observe(this,Observer{posts->
        adapter.posts=posts
        adapter.notifyDataSetChanged()
        })
        }
        }

