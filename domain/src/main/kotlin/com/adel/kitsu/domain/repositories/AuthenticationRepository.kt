package com.adel.kitsu.domain.repositories

import com.adel.kitsu.domain.either.Either
import com.adel.kitsu.domain.models.auth.TokenModel
import kotlinx.coroutines.flow.Flow

interface AuthenticationRepository {
    fun authenticate(username: String, password: String): Flow<Either<String, TokenModel>>
}