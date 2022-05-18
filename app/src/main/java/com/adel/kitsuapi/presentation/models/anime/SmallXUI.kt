package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.SmallXModel

data class SmallXUI(
    val width: Int?,
    val height: Int?
)

fun SmallXModel.toUI() = SmallXUI(width, height)
