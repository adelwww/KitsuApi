package com.adel.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.adel.kitsu.domain.models.anime.AnimeProductionsModel

data class AnimeProductions(
    @SerializedName("links")
    val links: LinksXXXXXXXXXX
)

fun AnimeProductions.toDomain() = AnimeProductionsModel(

    links.toDomain()
)