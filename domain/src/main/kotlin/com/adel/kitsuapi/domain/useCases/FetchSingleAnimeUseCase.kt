package com.adel.kitsuapi.domain.useCases

import com.adel.kitsuapi.domain.repositories.AnimeRepository
import javax.inject.Inject

class FetchSingleAnimeUseCase @Inject constructor(
    private val animeRepository: AnimeRepository
) {
    operator fun invoke(id: String) = animeRepository.fetchAnimeDetails(id)
}