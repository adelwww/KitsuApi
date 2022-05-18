package com.adel.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.adel.kitsu.domain.models.anime.TinyXModel

data class TinyX(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?
)

fun TinyX.toDomain() = TinyXModel(width, height)