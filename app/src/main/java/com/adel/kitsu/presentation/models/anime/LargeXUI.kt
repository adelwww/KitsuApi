package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.LargeXModel

data class LargeXUI(
    val width: Int?,
    val height: Int?
)

fun LargeXModel.toUI() = LargeXUI(width, height)
