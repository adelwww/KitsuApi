package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.DimensionsModel

data class DimensionsUI(

    val tiny: TinyUI,
    val small: SmallUI,
    val medium: MediumUI,
    val large: LargeUI
)

fun DimensionsModel.toUI() = DimensionsUI(
    tiny.toUI(), small.toUI(), medium.toUI(), large.toUI()
)