package com.adel.kitsuapi.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.adel.kitsuapi.domain.models.anime.AnimeProductionsModel

data class AnimeProductions(
    @SerializedName("links")
    val links: LinksXXXXXXXXXX
)

fun AnimeProductions.toDomain() = AnimeProductionsModel(

    links.toDomain()
)