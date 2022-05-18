package com.adel.kitsuapi.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.adel.kitsuapi.domain.models.anime.ReviewsModel

data class Reviews(
    @SerializedName("links")
    val links: LinksXXXXXX
)

fun Reviews.toDomain() = ReviewsModel(links.toDomain())