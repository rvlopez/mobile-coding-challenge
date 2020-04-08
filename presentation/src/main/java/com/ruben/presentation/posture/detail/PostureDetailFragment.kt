package com.ruben.presentation.posture.detail

import android.os.Bundle
import android.view.View
import com.ruben.domain.postures.entity.PostureDetail
import com.ruben.presentation.R
import com.ruben.presentation.base.fragment.BaseFragment
import com.ruben.presentation.extensions.*
import kotlinx.android.synthetic.main.fragment_posture_detail.*

class PostureDetailFragment : BaseFragment() {

    companion object {
        fun getFragment(postureId: String): PostureDetailFragment =
            PostureDetailFragment().apply {
                setSerializableParam(postureId)
            }
    }

    override var fragmentLayout: Int = R.layout.fragment_posture_detail

    private lateinit var postureDetailViewModel: PostureDetailViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewModel()
    }

    private fun setupViewModel() {
        val postureId: String = getSerializableParam()
        postureDetailViewModel = viewModel(viewModelFactory.get()) {
            getPostureDetails(postureId)

            observe(ldPostureDetail, ::setupUI)

            observe(ldLoading) { isLoading ->

            }

            observe(ldFailure) {

            }

        }

    }

    private fun setupUI(postureDetail: PostureDetail) {
        with(postureDetail) {
            postureImv.load(picture)
            nameTxv.text = name
            teacherTxv.text = getString(R.string.posture_detail_teacher_name, teacher)
            descriptionTxv.text = description
        }
    }

}