package com.adel.kitsu.presentation.models.manga

import com.adel.kitsu.domain.models.manga.LinksXXXModel

data class LinksXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXModel.toUI() = LinksXXXUI(
    self, related
)