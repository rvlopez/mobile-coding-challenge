package com.ruben.presentation.posture.detail

import com.ruben.presentation.base.fragment.BaseFragment
import com.ruben.presentation.posture.entity.PostureUI

class PostureDetailFragment : BaseFragment() {

    companion object {
        fun getFragment(postureUI: PostureUI): PostureDetailFragment = PostureDetailFragment()
    }

    override var fragmentLayout: Int = -1

}