package com.adel.kitsuapi.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.adel.kitsuapi.domain.models.manga.LinksXXXXModel

data class LinksXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXXX.toDomain() = LinksXXXXModel(
    self, related
)