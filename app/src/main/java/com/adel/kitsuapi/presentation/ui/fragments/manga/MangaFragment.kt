package com.adel.kitsuapi.presentation.ui.fragments.manga

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.adel.kitsuapi.R
import com.adel.kitsuapi.databinding.FragmentMangaBinding
import com.adel.kitsuapi.presentation.base.BaseFragment
import com.adel.kitsuapi.presentation.extensions.directionsSafeNavigation
import com.adel.kitsuapi.presentation.ui.adapters.MangaAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MangaFragment : BaseFragment<FragmentMangaBinding, MangaViewModel>(R.layout.fragment_manga) {
    override val binding by viewBinding(FragmentMangaBinding::bind)
    override val viewModel: MangaViewModel by viewModels()
    private val mangaAdapter = MangaAdapter(this::onItemClick)
    override fun assembleViews() {
        setupAdapter()
    }

    private fun setupAdapter() {
        binding.recyclerview.adapter = mangaAdapter
    }

    override fun launchObservers() {
        viewModel.fetchManga().spectatePaging(
            error = {
                Log.e("tag", it)
            },
            success = {
                mangaAdapter.submitData(it)
            }
        )

    }

    private fun onItemClick(id: String) {
        findNavController().directionsSafeNavigation(
            MangaFragmentDirections.actionMangaFragmentToMangaDetailedFragment(
                id
            )
        )
    }

}