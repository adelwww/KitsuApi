package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.TinyXModel

data class TinyXUI(
    val width: Int?,
    val height: Int?
)

fun TinyXModel.toUI() = TinyXUI(width, height)
