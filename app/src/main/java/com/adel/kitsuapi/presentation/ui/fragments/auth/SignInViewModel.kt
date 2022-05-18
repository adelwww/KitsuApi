package com.adel.kitsuapi.presentation.ui.fragments.auth

import com.adel.kitsuapi.domain.useCases.SignInUseCase
import com.adel.kitsuapi.presentation.base.BaseViewModel
import com.adel.kitsuapi.presentation.models.auth.TokenUI
import com.adel.kitsuapi.presentation.models.auth.toUI
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