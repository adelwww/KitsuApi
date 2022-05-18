package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.SmallXModel

data class SmallXUI(
    val width: Int?,
    val height: Int?
)

fun SmallXModel.toUI() = SmallXUI(width, height)
