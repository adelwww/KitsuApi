package com.adel.kitsuapi.presentation.ui.fragments.anime

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.adel.kitsuapi.R
import com.adel.kitsuapi.databinding.FragmentAnimeBinding
import com.adel.kitsuapi.presentation.base.BaseFragment
import com.adel.kitsuapi.presentation.extensions.directionsSafeNavigation
import com.adel.kitsuapi.presentation.ui.adapters.AnimeAdapter
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class AnimeFragment : BaseFragment<FragmentAnimeBinding, AnimeViewModel>(R.layout.fragment_anime) {
    override val binding by viewBinding(FragmentAnimeBinding::bind)
    override val viewModel: AnimeViewModel by viewModels()
    private val animeAdapter = AnimeAdapter(this::onItemClick)
    override fun assembleViews() {
        setupAdapter()
    }

    private fun setupAdapter() {
        binding.recyclerview.adapter = animeAdapter

    }

    override fun launchObservers() {
        viewModel.fetchAnime().spectatePaging(
            error = {
                Log.e("tag", it)
            },
            success = {
                animeAdapter.submitData(it)
            })
    }

    private fun onItemClick(id: String) {
        findNavController().directionsSafeNavigation(
            AnimeFragmentDirections.actionAnimeFragmentToAnimeDetailedFragment(
                id
            )
        )
    }


}