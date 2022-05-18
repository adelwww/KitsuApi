package com.adel.kitsuapi.presentation.models.manga

import com.adel.kitsuapi.domain.models.manga.LinksXModel

data class LinksXUI(
    val self: String,
    val related: String
)

fun LinksXModel.toUI() = LinksXUI(self, related)
