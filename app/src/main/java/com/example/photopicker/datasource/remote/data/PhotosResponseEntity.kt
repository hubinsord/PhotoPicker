package com.example.photopicker.datasource.remote.data

import com.squareup.moshi.Json


data class PhotosResponseEntity(
    @Json(name = "page")
    val page: Int,

    @Json(name = "pages")
    val pages: Int,

    @Json(name = "perpage")
    val perPage: Int,

    @Json(name = "photo")
    val photo: List<PhotoResponseEntity>,

    @Json(name = "total")
    val total: Int
)
