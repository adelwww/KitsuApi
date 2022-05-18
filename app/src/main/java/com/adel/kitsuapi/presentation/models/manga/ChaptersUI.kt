package com.adel.kitsuapi.presentation.models.manga

import com.adel.kitsuapi.domain.models.manga.ChaptersModel

data class ChaptersUI(
    val links: LinksXXXXXXXXUI
)

fun ChaptersModel.toUI() = ChaptersUI(links.toUI())