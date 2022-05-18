package com.adel.kitsuapi.domain.useCases

import com.adel.kitsuapi.domain.repositories.MangaRepository
import javax.inject.Inject

class FetchDetailedMangaUseCase @Inject constructor(
    private val mangaRepository: MangaRepository
) {
    operator fun invoke(id: String) = mangaRepository.fetchDetailedManga(id)
}