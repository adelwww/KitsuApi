package com.adel.kitsu.presentation.models.manga

import com.adel.kitsu.domain.models.manga.TinyModel

data class TinyUI(
    val width: Int?,
    val height: Int?
)

fun TinyModel.toUI() = TinyUI(width, height)
