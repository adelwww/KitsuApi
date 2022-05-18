package com.adel.kitsu.domain.useCases

import com.adel.kitsu.domain.repositories.AuthenticationRepository
import javax.inject.Inject

class SignInUseCase @Inject constructor(
    private val authenticationRepository: AuthenticationRepository
) {
    operator fun invoke(username: String, password: String) =
        authenticationRepository.authenticate(username, password)
}