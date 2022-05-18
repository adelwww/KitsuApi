package com.adel.kitsu.presentation.models.manga

import com.adel.kitsu.domain.models.manga.LinksXXXXXXXXXXModel

data class LinksXXXXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXUI(self, related)
