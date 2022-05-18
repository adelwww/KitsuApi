package com.adel.kitsu.presentation.models.manga

import com.adel.kitsu.domain.models.manga.MangaCharactersModel

data class MangaCharactersUI(
    val links: LinksXXXXXXXXXUI
)

fun MangaCharactersModel.toUI() = MangaCharactersUI(links.toUI())
