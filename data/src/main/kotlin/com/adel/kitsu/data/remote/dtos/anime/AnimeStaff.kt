package com.adel.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.adel.kitsu.domain.models.anime.AnimeStaffModel

data class AnimeStaff(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXX
)

fun AnimeStaff.toDomain() = AnimeStaffModel(
    links.toDomain()
)