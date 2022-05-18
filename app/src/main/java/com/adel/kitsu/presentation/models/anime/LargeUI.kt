package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.LargeModel

data class LargeUI(
    val width: Int?,
    val height: Int?
)

fun LargeModel.toUI() = LargeUI(width, height)
