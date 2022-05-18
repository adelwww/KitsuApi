package com.adel.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.adel.kitsu.domain.models.anime.MediumModel

data class Medium(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?
)

fun Medium.toDomain() = MediumModel(width, height)