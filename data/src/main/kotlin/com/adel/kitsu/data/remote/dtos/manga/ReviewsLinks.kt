package com.adel.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.adel.kitsu.domain.models.manga.LinksXXXXXXModel

data class LinksXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXXXXX.toDomain() = LinksXXXXXXModel(
    self, related
)