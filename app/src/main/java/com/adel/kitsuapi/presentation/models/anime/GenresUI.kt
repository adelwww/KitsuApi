package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.GenresModel

data class GenresUI(
    val linksXUI: LinksXUI
)

fun GenresModel.toUI() = GenresUI(linksXModel.toUI())
