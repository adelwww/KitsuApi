package com.adel.kitsu.presentation.models.manga

import com.adel.kitsu.domain.models.manga.LinksModel

data class LinksUI(
    val self: String
)

fun LinksModel.toUI() = LinksUI(self)
