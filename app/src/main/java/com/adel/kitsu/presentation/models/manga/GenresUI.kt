package com.adel.kitsu.presentation.models.manga

import com.adel.kitsu.domain.models.manga.GenresModel

data class GenresUI(
    val links: LinksXUI
)

fun GenresModel.toUI() = GenresUI(links.toUI())