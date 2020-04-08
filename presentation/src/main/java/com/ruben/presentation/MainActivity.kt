package com.ruben.presentation

import android.os.Bundle
import com.ruben.presentation.base.fragment.BaseFragment
import com.ruben.presentation.posture.list.PostureListFragment
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pushChildStack(PostureListFragment.getPostureListFragment())
    }

    private fun pushChildStack(fragment: BaseFragment) {
        if (isFinishing.not()) {
            supportFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .add(R.id.parentContainer, fragment)
                .commit()
        }
    }

}