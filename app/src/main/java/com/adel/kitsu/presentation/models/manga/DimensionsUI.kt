package com.adel.kitsu.presentation.models.manga

import com.adel.kitsu.domain.models.manga.DimensionsModel

data class DimensionsUI(
    val tiny: TinyUI,
    val small: SmallUI,
    val medium: MediumUI,
    val large: LargeUI
)

fun DimensionsModel.toUI() = DimensionsUI(tiny.toUI(), small.toUI(), medium.toUI(), large.toUI())