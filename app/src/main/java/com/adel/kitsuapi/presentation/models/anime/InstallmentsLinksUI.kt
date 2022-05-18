package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.LinksXXXXModel

data class LinksXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXModel.toUI() = LinksXXXXUI(self, related)
