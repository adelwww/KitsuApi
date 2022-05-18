package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.LinksXXModel

data class LinksXXUI(
    val self: String,
    val related: String
)

fun LinksXXModel.toUI() = LinksXXUI(self, related)