package com.adel.kitsuapi.presentation.models.manga

import com.adel.kitsuapi.domain.models.manga.LinksXXXXXXXXXModel

data class LinksXXXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXXXModel.toUI() = LinksXXXXXXXXXUI(self, related)
