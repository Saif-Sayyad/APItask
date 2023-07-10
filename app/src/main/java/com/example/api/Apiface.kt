package com.example.api

import retrofit2.Call
import retrofit2.http.GET

interface Apiface {
    @GET("products")
    fun getProductData(): Call<Mydata>
}