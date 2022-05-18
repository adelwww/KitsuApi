package com.adel.kitsu.presentation.models.manga

import com.adel.kitsu.domain.models.manga.LinksXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXUI(
    val first: String,
    val prev: String?,
    val next: String,
    val last: String
)

fun LinksXXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXXUI(first, prev, next, last)
