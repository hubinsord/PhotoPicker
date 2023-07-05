package com.example.photopicker.datasource.remote.data

import com.squareup.moshi.Json

data class SearchPhotoResponseEntity(
    @Json(name = "photos")
    val photos: PhotosResponseEntity,

    @Json(name = "stat")
    val stat: String
)
