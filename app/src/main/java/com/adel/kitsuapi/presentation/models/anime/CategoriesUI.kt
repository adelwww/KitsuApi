package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.CategoriesModel

data class CategoriesUI(
    val links: LinksXXUI
)

fun CategoriesModel.toUI() = CategoriesUI(links.toUI())