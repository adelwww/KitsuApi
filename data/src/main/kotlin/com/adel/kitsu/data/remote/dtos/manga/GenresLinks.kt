package com.adel.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName

data class LinksX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksX.toDomain() = com.adel.kitsu.domain.models.manga.LinksXModel(
    self, related
)