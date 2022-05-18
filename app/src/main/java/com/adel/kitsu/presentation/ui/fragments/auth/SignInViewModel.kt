package com.adel.kitsu.presentation.ui.fragments.auth

import com.adel.kitsu.domain.useCases.SignInUseCase
import com.adel.kitsu.presentation.base.BaseViewModel
import com.adel.kitsu.presentation.models.auth.TokenUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(
    private val signInUseCase: SignInUseCase
) : BaseViewModel() {
    private val _signInState = mutableUiStateFlow<TokenUI>()
    val signInState = _signInState.asStateFlow()

    fun signIn(username: String, password: String) =
        signInUseCase(username, password).gatherRequest(_signInState) { it.toUI() }
}