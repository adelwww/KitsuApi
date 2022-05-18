package com.adel.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.adel.kitsu.domain.models.anime.StreamingLinksModel

data class StreamingLinks(
    @SerializedName("links")
    val links: LinksXXXXXXXXX
)

fun StreamingLinks.toDomain() = StreamingLinksModel(links.toDomain())