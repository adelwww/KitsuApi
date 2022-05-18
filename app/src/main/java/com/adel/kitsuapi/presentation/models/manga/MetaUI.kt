package com.adel.kitsuapi.presentation.models.manga

import com.adel.kitsuapi.domain.models.manga.MetaModel

data class MetaUI(
    val dimensionsModel: DimensionsUI
)

fun MetaModel.toUI() = MetaUI(dimensionsModel.toUI())