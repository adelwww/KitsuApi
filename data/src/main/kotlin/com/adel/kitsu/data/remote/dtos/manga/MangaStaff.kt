package com.adel.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.adel.kitsu.domain.models.manga.MangaStaffModel

data class MangaStaff(
    @SerializedName("links")
    val links: LinksXXXXXXXXXX
)

fun MangaStaff.toDomain() =
    MangaStaffModel(links.toDomain())