package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.GenresModel

data class GenresUI(
    val linksXUI: LinksXUI
)

fun GenresModel.toUI() = GenresUI(linksXModel.toUI())
