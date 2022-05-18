package com.adel.kitsuapi.presentation.models.manga

import com.adel.kitsuapi.domain.models.manga.TinyXModel

data class TinyXUI(
    val width: Int?,
    val height: Int?
)

fun TinyXModel.toUI() = TinyXUI(width, height)
