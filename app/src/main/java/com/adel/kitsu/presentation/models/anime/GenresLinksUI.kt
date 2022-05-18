package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.LinksXModel

data class LinksXUI(
    val self: String,
    val related: String
)

fun LinksXModel.toUI() = LinksXUI(self, related)
