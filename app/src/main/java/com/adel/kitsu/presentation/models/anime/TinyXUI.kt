package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.TinyXModel

data class TinyXUI(
    val width: Int?,
    val height: Int?
)

fun TinyXModel.toUI() = TinyXUI(width, height)
