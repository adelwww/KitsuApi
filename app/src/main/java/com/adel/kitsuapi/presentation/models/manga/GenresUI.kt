package com.adel.kitsuapi.presentation.models.manga

import com.adel.kitsuapi.domain.models.manga.GenresModel

data class GenresUI(
    val links: LinksXUI
)

fun GenresModel.toUI() = GenresUI(links.toUI())