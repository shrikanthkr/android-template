package com.justshow.justshow.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.justshow.app.R
import com.justshow.app.databinding.FragmentEnterUserNameBinding
import com.justshow.core.launch
import dagger.android.support.DaggerFragment

class EnterUsernameFragment : Fragment(R.layout.fragment_enter_user_name) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentEnterUserNameBinding.bind(view)
        binding.submit.setOnClickListener {
            //TODO, figure out the launch with parameters
            launch(RepoListFragment())
        }

    }
}