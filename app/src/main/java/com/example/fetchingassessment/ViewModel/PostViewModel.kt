package com.example.fetchingassessment.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fetchingassessment.Post
import com.example.fetchingassessment.PostRepository.PostRepository
import com.example.fetchingassessment.RetrofitClient
import kotlinx.coroutines.Dispatchers

private val Any.androidx: Any
    get() {
        TODO("Not yet implemented")
    }

class PostViewModel(repository: PostRepository) : ViewModel() {
    private val apiService = RetrofitClient.create()

    private val _posts = MutableLiveData<List<Post>>()
    val posts: LiveData<List<Post>> get() = _posts

    fun fetchPosts() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = apiService.androidx.compose.foundation.layout.Box {
                    getPosts()
                }
                if (response.isSuccessful) {
                    _posts.postValue(response.body())
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    private fun getPosts() {
        TODO("Not yet implemented")
    }
}

private fun RetrofitClient.Companion.create(): Any {
    TODO("Not yet implemented")
}
