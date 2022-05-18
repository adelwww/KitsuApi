package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.MetaXModel

data class MetaXUI(
    val dimensions: DimensionsXUI
)

fun MetaXModel.toUI() = MetaXUI(dimensionsXModel.toUI())
