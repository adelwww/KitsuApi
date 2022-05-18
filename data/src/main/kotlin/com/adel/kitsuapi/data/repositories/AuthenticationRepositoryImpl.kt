package com.adel.kitsuapi.data.repositories

import com.adel.kitsuapi.data.local.preferences.PreferencesHelper
import com.adel.kitsuapi.data.remote.apiservices.AuthenticationApiService
import com.adel.kitsuapi.data.remote.dtos.auth.AuthDto
import com.adel.kitsuapi.data.remote.dtos.auth.toDomain
import com.adel.kitsuapi.data.repositories.base.BaseRepository
import com.adel.kitsuapi.domain.models.auth.TokenModel
import com.adel.kitsuapi.domain.repositories.AuthenticationRepository
import javax.inject.Inject

class AuthenticationRepositoryImpl @Inject constructor(
    private val authenticationApiService: AuthenticationApiService,
    private val preferencesHelper: PreferencesHelper
) : BaseRepository(), AuthenticationRepository {
    override fun authenticate(
        username: String,
        password: String
    ) = sendRequest(this::saveToken) {
        authenticationApiService.authenticate(AuthDto(username = username, password = password))
            .toDomain()
    }

    private fun saveToken(tokenModel: TokenModel) {
        preferencesHelper.accessToken = tokenModel.accessToken
        preferencesHelper.refreshToken = tokenModel.refreshToken
        preferencesHelper.isAuthenticated = true
    }
}