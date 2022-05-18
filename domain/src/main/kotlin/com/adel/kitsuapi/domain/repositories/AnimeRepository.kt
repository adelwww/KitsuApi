package com.adel.kitsuapi.domain.repositories

import com.adel.kitsuapi.domain.either.Either
import com.adel.kitsuapi.domain.models.anime.SingleAnimeModel
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {
    fun fetchAnimeDetails(id: String): Flow<Either<String, SingleAnimeModel>>
}