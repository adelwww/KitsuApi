package com.adel.kitsuapi.presentation.models.manga

import com.adel.kitsuapi.domain.models.manga.LinksModel

data class LinksUI(
    val self: String
)

fun LinksModel.toUI() = LinksUI(self)
