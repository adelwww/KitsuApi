package com.adel.kitsuapi.presentation.models.manga

import com.adel.kitsuapi.domain.models.manga.SmallXModel

data class SmallXUI(
    val width: Int?,
    val height: Int?
)

fun SmallXModel.toUI() = SmallXUI(width, height)