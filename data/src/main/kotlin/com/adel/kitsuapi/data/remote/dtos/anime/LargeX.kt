package com.adel.kitsuapi.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.adel.kitsuapi.domain.models.anime.LargeXModel

data class LargeX(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?
)

fun LargeX.toDomain() = LargeXModel(width, height)