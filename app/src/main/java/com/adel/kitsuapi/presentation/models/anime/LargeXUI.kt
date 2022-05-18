package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.LargeXModel

data class LargeXUI(
    val width: Int?,
    val height: Int?
)

fun LargeXModel.toUI() = LargeXUI(width, height)
