package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.SmallModel

data class SmallUI(
    val width: Int?,
    val height: Int?
)

fun SmallModel.toUI() = SmallUI(width, height)
