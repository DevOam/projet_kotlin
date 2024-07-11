package com.example.myapplication.services


import com.example.myapplication.model.Post
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

data class LoginRequest(val email: String, val password: String)
data class LoginResponse(val token: String, val user: User)
data class User(val id: Int, val name: String, val email: String)

interface ApiService {
    @POST("auth/check?")
    fun login(@Body request: LoginRequest): Call<LoginResponse>

    @GET("posts")
    fun getPosts(): Call<List<Post>>
}
