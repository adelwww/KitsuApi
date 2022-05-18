package com.adel.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.adel.kitsu.domain.models.manga.LargeModel

data class Large(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?
)

fun Large.toDomain() = LargeModel(width, height)