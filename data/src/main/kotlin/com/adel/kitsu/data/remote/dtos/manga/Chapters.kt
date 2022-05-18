package com.adel.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.adel.kitsu.domain.models.manga.ChaptersModel

data class Chapters(
    @SerializedName("links")
    val links: LinksXXXXXXXX
)

fun Chapters.toDomain() = ChaptersModel(
    links.toDomain()
)