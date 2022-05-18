package com.adel.kitsu.presentation.models.manga

import com.adel.kitsu.domain.models.manga.LinksXXXXXXXXXModel

data class LinksXXXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXXXModel.toUI() = LinksXXXXXXXXXUI(self, related)
