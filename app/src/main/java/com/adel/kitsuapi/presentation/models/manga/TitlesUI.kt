package com.adel.kitsuapi.presentation.models.manga

import com.adel.kitsuapi.domain.models.manga.TitlesModel

data class TitlesUI(
    val en: String?,
    val enJp: String?,
    val jaJp: String?
)

fun TitlesModel.toUI() = TitlesUI(en, enJp, jaJp)
