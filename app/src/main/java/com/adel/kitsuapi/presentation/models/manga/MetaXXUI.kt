package com.adel.kitsuapi.presentation.models.manga

import com.adel.kitsuapi.domain.models.manga.MetaXXModel

data class MetaXXUI(
    val count: Int
)

fun MetaXXModel.toUI() = MetaXXUI(count)
