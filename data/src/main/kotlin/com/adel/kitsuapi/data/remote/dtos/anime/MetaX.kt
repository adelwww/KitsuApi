package com.adel.kitsuapi.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.adel.kitsuapi.domain.models.anime.MetaXModel

data class MetaX(
    @SerializedName("dimensions")
    val dimensions: DimensionsX
)

fun MetaX.toDomain() = MetaXModel(
    dimensions.toDomain()
)