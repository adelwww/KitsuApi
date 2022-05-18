package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.LinksXXXXXModel

data class LinksXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXModel.toUI() = LinksXXXXXUI(self, related)
