package com.adel.kitsuapi.presentation.models.manga

import com.adel.kitsuapi.domain.models.manga.TinyModel

data class TinyUI(
    val width: Int?,
    val height: Int?
)

fun TinyModel.toUI() = TinyUI(width, height)
