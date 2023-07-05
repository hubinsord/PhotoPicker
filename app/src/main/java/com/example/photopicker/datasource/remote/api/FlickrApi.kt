package com.example.photopicker.datasource.remote.api

import retrofit2.http.GET
import retrofit2.http.Query

interface FlickrApi {

    @GET("services/rest/")
    suspend fun searchPhotoByText(
        @Query("method") method: String = "flickr.photos.search",
        @Query("method") text: String,
        @Query("method") format: String = "rest",
    )

    companion object{
        const val BASE_URL = "https://www.flickr.com/"
    }
}