package com.adel.kitsu.presentation.models.manga

import com.adel.kitsu.domain.models.manga.SmallXModel

data class SmallXUI(
    val width: Int?,
    val height: Int?
)

fun SmallXModel.toUI() = SmallXUI(width, height)