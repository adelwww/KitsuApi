package com.adel.kitsuapi.presentation.models.manga

import com.adel.kitsuapi.domain.models.manga.LinksXXXXModel

data class LinksXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXModel.toUI() = LinksXXXXUI(self, related)
