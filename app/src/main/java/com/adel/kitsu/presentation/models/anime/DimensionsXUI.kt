package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.DimensionsXModel

data class DimensionsXUI(
    val tiny: TinyXUI,
    val small: SmallXUI,
    val large: LargeXUI
)

fun DimensionsXModel.toUI() = DimensionsXUI(tiny.toUI(), small.toUI(), large.toUI())
