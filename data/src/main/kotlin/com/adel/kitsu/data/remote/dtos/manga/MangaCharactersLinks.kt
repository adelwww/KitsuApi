package com.adel.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.adel.kitsu.domain.models.manga.LinksXXXXXXXXXModel

data class LinksXXXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXXXXXXXX.toDomain() = LinksXXXXXXXXXModel(

    self, related
)