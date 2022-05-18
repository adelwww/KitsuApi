package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.LinksXXXXXXXXModel

data class LinksXXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXXModel.toUI() = LinksXXXXXXXXUI(self, related)
