package com.adel.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.adel.kitsu.domain.models.anime.MetaModel

data class Meta(
    @SerializedName("dimensions")
    val dimensions: Dimensions
)

fun Meta.toDomain() = MetaModel(dimensions.toDomain())