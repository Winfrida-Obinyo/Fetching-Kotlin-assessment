package com.example.fetchingassessment

data class Post(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
)
fun main() {

    val post = Post(userId = 1, id = 101, title = "This is the post title", body = "This is the post body")


    println("User ID: ${post.userId}")
    println("ID: ${post.id}")
    println("Title: ${post.title}")
    println("Body: ${post.body}")
}
