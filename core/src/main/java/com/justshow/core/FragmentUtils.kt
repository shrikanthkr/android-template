package com.justshow.core

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit


fun AppCompatActivity.launch(fragment: Fragment) {
    supportFragmentManager.commit {
        add(R.id.container, fragment, "${supportFragmentManager.backStackEntryCount}")
        addToBackStack(null)
    }

}

fun Fragment.launch(fragment: Fragment) {
    val count = requireActivity().supportFragmentManager.backStackEntryCount
    requireActivity().supportFragmentManager.commit {
        replace(R.id.container, fragment, "$count")
        addToBackStack(null)
    }

}