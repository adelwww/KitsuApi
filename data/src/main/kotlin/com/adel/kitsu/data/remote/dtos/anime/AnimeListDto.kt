package com.adel.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.adel.kitsu.domain.models.anime.AnimeListModel

data class AnimeListDto(
    @SerializedName("data")
    val data: List<AnimeDataDto>,
    @SerializedName("meta")
    val meta: MetaXX? = null,
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXX? = null
)

fun AnimeListDto.toDomain() = AnimeListModel(
    data.map { it.toDomain() }, meta?.toDomain(), links?.toDomain()
)

