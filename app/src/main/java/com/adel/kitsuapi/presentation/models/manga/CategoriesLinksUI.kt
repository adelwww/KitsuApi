package com.adel.kitsuapi.presentation.models.manga

import com.adel.kitsuapi.domain.models.manga.LinksXXModel

data class LinksXXUI(
    val self: String,
    val related: String
)

fun LinksXXModel.toUI() = LinksXXUI(self, related)
