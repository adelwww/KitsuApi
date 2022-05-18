package com.adel.kitsuapi.presentation.models.manga

import com.adel.kitsuapi.domain.models.manga.CategoriesModel

data class CategoriesUI(
    val links: LinksXXUI
)

fun CategoriesModel.toUI() = CategoriesUI(links.toUI())