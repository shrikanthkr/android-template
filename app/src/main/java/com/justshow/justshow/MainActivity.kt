package com.justshow.justshow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.justshow.app.R
import com.justshow.core.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(supportFragmentManager.backStackEntryCount == 0) {
            this.launch(com.justshow.justshow.fragments.EnterUsernameFragment())
        }
    }

}