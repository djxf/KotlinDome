package com.djxf.kotlindome

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface GithubService {

    @GET("users/{user}/repos")
    fun listRepo(@Path("user")user: String): Call<Repo>
    //疑问1： 方法listRepo为啥返回了一个Call<List<Repo>>?
}