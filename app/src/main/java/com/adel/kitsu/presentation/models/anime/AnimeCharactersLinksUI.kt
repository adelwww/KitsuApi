package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.LinksXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXXUI(self, related)
