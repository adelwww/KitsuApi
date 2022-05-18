package com.adel.kitsuapi.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.adel.kitsuapi.domain.models.manga.InstallmentsModel

data class Installments(
    @SerializedName("links")
    val links: LinksXXXX
)

fun Installments.toDomain() =
    InstallmentsModel(links.toDomain())