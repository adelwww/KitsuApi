package com.adel.kitsuapi.presentation.models.manga

import com.adel.kitsuapi.domain.models.manga.SmallModel

data class SmallUI(
    val width: Int?,
    val height: Int?
)

fun SmallModel.toUI() = SmallUI(width, height)
