package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.LinksXXXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXXXUI(
    val first: String,
    val prev: String?,
    val next: String,
    val last: String
)

fun LinksXXXXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXXXXUI(first, prev, next, last)
