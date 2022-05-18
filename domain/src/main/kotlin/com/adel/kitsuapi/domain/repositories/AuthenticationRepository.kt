package com.adel.kitsuapi.domain.repositories

import com.adel.kitsuapi.domain.either.Either
import com.adel.kitsuapi.domain.models.auth.TokenModel
import kotlinx.coroutines.flow.Flow

interface AuthenticationRepository {
    fun authenticate(username: String, password: String): Flow<Either<String, TokenModel>>
}