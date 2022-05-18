package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.LinksXModel

data class LinksXUI(
    val self: String,
    val related: String
)

fun LinksXModel.toUI() = LinksXUI(self, related)
