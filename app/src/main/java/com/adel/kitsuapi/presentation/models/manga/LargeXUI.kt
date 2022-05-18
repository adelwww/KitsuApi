package com.adel.kitsuapi.presentation.models.manga

import com.adel.kitsuapi.domain.models.manga.LargeXModel

data class LargeXUI(
    val width: Int?,
    val height: Int?
)

fun LargeXModel.toUI() = LargeXUI(width, height)