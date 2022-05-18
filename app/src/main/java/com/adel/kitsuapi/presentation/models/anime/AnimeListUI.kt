package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.AnimeListModel

data class AnimeListUI(
    val data: List<AnimeDataUI>,
    val meta: MetaXXUI? = null,
    val links: LinksXXXXXXXXXXXXXUI? = null
)

fun AnimeListModel.toUI() = AnimeListUI(data.map { it.toUI() }, meta?.toUI(), links?.toUI())
