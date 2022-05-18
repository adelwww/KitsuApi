package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.TitlesModel

data class TitlesUI(
    val en: String?,
    val enJp: String?,
    val jaJp: String?
)

fun TitlesModel.toUI() = TitlesUI(en, enJp, jaJp)
