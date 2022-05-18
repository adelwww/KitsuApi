package com.adel.kitsu.presentation.models.manga

import com.adel.kitsu.domain.models.manga.TinyXModel

data class TinyXUI(
    val width: Int?,
    val height: Int?
)

fun TinyXModel.toUI() = TinyXUI(width, height)
