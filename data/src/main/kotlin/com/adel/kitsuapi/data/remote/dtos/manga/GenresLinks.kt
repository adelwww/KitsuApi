package com.adel.kitsuapi.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName

data class LinksX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksX.toDomain() = com.adel.kitsuapi.domain.models.manga.LinksXModel(
    self, related
)