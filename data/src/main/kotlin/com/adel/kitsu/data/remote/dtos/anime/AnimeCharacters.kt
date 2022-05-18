package com.adel.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.adel.kitsu.domain.models.anime.AnimeCharactersModel

data class AnimeCharacters(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXX
)

fun AnimeCharacters.toDomain() = AnimeCharactersModel(
    links.toDomain()
)