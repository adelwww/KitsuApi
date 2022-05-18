package com.adel.kitsuapi.presentation.models.manga

import com.adel.kitsuapi.domain.models.manga.SingleMangaModel

data class SingleMangaUI(
    val data: MangaDataUI
)

fun SingleMangaModel.toUI() = SingleMangaUI(data.toUI())
