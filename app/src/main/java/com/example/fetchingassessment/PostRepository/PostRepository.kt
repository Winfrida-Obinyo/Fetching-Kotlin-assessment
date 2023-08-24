package com.example.fetchingassessment.PostRepository

import com.example.fetchingassessment.Post
import com.example.fetchingassessment.PostApiService

class PostRepository (private val apiService: PostApiService) {
    suspend fun getPosts(): List<Post> {
        return apiService.getPosts()
    }
}