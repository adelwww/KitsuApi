package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.LinksXXXModel

data class LinksXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXModel.toUI() = LinksXXXUI(self, related)
