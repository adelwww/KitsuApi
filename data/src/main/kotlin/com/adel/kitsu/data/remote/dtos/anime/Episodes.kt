package com.adel.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.adel.kitsu.domain.models.anime.EpisodesModel

data class Episodes(
    @SerializedName("links")
    val links: LinksXXXXXXXX
)

fun Episodes.toDomain() = EpisodesModel(
    links.toDomain()
)