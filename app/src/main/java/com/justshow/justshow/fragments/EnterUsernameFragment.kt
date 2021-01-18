package com.justshow.justshow.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.justshow.app.databinding.FragmentEnterUserNameBinding
import com.justshow.core.launch
import dagger.android.support.DaggerFragment

class EnterUsernameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentEnterUserNameBinding.inflate(inflater, container, false).root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentEnterUserNameBinding.bind(view)
        binding.submit.setOnClickListener {
            //TODO, figure out the launch with parameters
            launch(RepoListFragment())
        }

    }
}