package com.adel.kitsu.presentation.models.manga

import com.adel.kitsu.domain.models.manga.LinksXXXXXXModel

data class LinksXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXModel.toUI() = LinksXXXXXXUI(self, related)
