package com.adel.kitsu.data.remote.dtos.manga

import com.google.gson.annotations.SerializedName
import com.adel.kitsu.domain.models.manga.SingleMangaModel

data class SingleMangaDto(
    @SerializedName("data")
    val data: MangaData
)

fun SingleMangaDto.toDomain() = SingleMangaModel(data.toDomain())

