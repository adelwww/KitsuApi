package com.adel.kitsuapi.presentation.ui.fragments.auth

import android.widget.Toast
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.adel.kitsuapi.R
import com.adel.kitsuapi.databinding.FragmentSignInBinding
import com.adel.kitsuapi.presentation.base.BaseFragment
import com.adel.kitsuapi.presentation.extensions.mainNavControllerNavigation
import com.adel.kitsuapi.presentation.extensions.safeNavigation
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class SignInFragment :
    BaseFragment<FragmentSignInBinding, SignInViewModel>(R.layout.fragment_sign_in) {
    override val binding by viewBinding(FragmentSignInBinding::bind)
    override val viewModel: SignInViewModel by viewModels()

    override fun launchObservers() {
        subscribeToAuthorization()
    }

    private fun subscribeToAuthorization() {
        viewModel.signInState.spectateUiState(error = {
            Toast.makeText(
                requireActivity(),
                "An unexpected error occurred! Try authenticating again",
                Toast.LENGTH_SHORT
            ).show()
        },
            success = {
                mainNavControllerNavigation().safeNavigation(R.id.action_signInFlowFragment_to_mainFlowFragment)

            }, gatherIfSucceed = {
                binding.progressbar
            })
    }

    override fun setupListeners() {

        binding.btnSignIn.setOnClickListener {
            viewModel.signIn(binding.etEmail.text.toString(), binding.etPassword.text.toString())
        }
    }
}