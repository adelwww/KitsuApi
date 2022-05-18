package com.adel.kitsuapi.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.adel.kitsuapi.domain.models.manga.TinyModel

data class Tiny(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?

)

fun Tiny.toDomain() = TinyModel(width, height)