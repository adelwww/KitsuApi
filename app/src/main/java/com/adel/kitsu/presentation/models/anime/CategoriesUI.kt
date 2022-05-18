package com.adel.kitsu.presentation.models.anime

import com.adel.kitsu.domain.models.anime.CategoriesModel

data class CategoriesUI(
    val links: LinksXXUI
)

fun CategoriesModel.toUI() = CategoriesUI(links.toUI())