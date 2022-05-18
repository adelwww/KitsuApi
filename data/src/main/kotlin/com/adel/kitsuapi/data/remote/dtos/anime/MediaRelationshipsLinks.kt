package com.adel.kitsuapi.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName

data class LinksXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXXXXXX.toDomain() = com.adel.kitsuapi.domain.models.anime.LinksXXXXXXXModel(
    self, related
)