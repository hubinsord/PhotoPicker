package com.example.photopicker.datasource.remote.data

import com.squareup.moshi.Json

data class PhotoResponseEntity(
    @Json(name = "farm")
    val farm: Int,

    @Json(name = "id")
    val id: String,

    @Json(name = "isfamily")
    val isFamily: Int,

    @Json(name = "isfriend")
    val isFriend: Int,

    @Json(name = "ispublic")
    val isPublic: Int,

    @Json(name = "owner")
    val owner: String,

    @Json(name = "secret")
    val secret: String,

    @Json(name = "server")
    val server: String,

    @Json(name = "title")
    val title: String
)