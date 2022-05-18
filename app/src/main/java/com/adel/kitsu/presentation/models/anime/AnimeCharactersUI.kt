package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.AnimeCharactersModel

data class AnimeCharactersUI(
    val links: LinksXXXXXXXXXXXUI
)

fun AnimeCharactersModel.toUI() = AnimeCharactersUI(links.toUI())
