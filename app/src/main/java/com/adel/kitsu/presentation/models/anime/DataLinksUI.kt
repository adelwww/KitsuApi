package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.LinksModel

data class LinksUI(
    val self: String
)

fun LinksModel.toUI() = LinksUI(
    self
)
