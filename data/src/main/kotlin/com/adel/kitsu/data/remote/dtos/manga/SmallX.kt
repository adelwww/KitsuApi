package com.adel.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.adel.kitsu.domain.models.manga.SmallXModel

data class SmallX(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?
)

fun SmallX.toDomain() = SmallXModel(width, height)