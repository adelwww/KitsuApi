package com.adel.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXXXXXXXX.toDomain() = com.adel.kitsu.domain.models.anime.LinksXXXXXXXXXModel(
    self, related
)