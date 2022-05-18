package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.LinksModel

data class LinksUI(
    val self: String
)

fun LinksModel.toUI() = LinksUI(
    self
)
