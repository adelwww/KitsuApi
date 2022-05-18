package com.adel.kitsu.domain.repositories

import com.adel.kitsu.domain.either.Either
import com.adel.kitsu.domain.models.anime.SingleAnimeModel
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {
    fun fetchAnimeDetails(id: String): Flow<Either<String, SingleAnimeModel>>
}