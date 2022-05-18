package com.adel.kitsuapi.presentation.models.anime

import com.adel.kitsuapi.domain.models.anime.InstallmentsModel

data class InstallmentsUI(
    val links: LinksXXXXUI
)

fun InstallmentsModel.toUI() = InstallmentsUI(links.toUI())
