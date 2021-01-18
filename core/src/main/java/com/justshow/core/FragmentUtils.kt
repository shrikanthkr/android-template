package com.justshow.core

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


fun AppCompatActivity.launch(fragment: Fragment) {
    supportFragmentManager.run {
        beginTransaction()
            .add(R.id.container, fragment, "${supportFragmentManager.backStackEntryCount}")
            .addToBackStack(null)
            .commit()
    }

}

fun Fragment.launch(fragment: Fragment) {
    requireActivity().supportFragmentManager.run {
        beginTransaction()
            .add(fragment, "${this.backStackEntryCount}")
            .addToBackStack(null)
            .commit()
    }

}