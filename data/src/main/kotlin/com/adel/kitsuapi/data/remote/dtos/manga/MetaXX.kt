package com.adel.kitsuapi.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.adel.kitsuapi.domain.models.manga.MetaXXModel

data class MetaXX(
    @SerializedName("count")
    val count: Int
)

fun MetaXX.toDomain() = MetaXXModel(count)