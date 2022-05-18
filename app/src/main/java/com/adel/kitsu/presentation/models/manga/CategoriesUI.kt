package com.adel.kitsu.presentation.models.manga

import com.adel.kitsu.domain.models.manga.CategoriesModel

data class CategoriesUI(
    val links: LinksXXUI
)

fun CategoriesModel.toUI() = CategoriesUI(links.toUI())