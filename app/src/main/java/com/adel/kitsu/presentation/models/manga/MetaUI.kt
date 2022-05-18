package com.adel.kitsu.presentation.models.manga

import com.adel.kitsu.domain.models.manga.MetaModel

data class MetaUI(
    val dimensionsModel: DimensionsUI
)

fun MetaModel.toUI() = MetaUI(dimensionsModel.toUI())