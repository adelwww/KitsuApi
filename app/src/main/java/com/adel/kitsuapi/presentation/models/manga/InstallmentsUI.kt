package com.adel.kitsuapi.presentation.models.manga

import com.adel.kitsuapi.domain.models.manga.InstallmentsModel

data class InstallmentsUI(
    val links: LinksXXXXUI
)

fun InstallmentsModel.toUI() = InstallmentsUI(links.toUI())
