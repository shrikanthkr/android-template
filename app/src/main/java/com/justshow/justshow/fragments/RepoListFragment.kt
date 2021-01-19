package com.justshow.justshow.fragments

import android.os.Bundle
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.justshow.app.R
import com.justshow.justshow.RepoListViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class RepoListFragment : DaggerFragment(R.layout.fragment_repo_list) {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel by viewModels<RepoListViewModel> { viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}