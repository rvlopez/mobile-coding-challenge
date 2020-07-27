package com.ruben.presentation.posture.list

import android.os.Bundle
import android.view.View
import com.ruben.domain.base.Failure
import com.ruben.presentation.R
import com.ruben.presentation.base.fragment.BaseFragment
import com.ruben.presentation.extensions.gone
import com.ruben.presentation.extensions.observe
import com.ruben.presentation.extensions.viewModel
import com.ruben.presentation.extensions.visible
import com.ruben.presentation.posture.detail.PostureDetailFragment
import com.ruben.presentation.posture.entity.PostureUI
import kotlinx.android.synthetic.main.circular_progress_bar.*
import kotlinx.android.synthetic.main.fragment_posture_list.*
import kotlinx.android.synthetic.main.item_error.*
import kotlinx.android.synthetic.main.item_posture.*

class PostureListFragment : BaseFragment() {

    companion object {
        fun getPostureListFragment(): PostureListFragment = PostureListFragment()
    }

    override var fragmentLayout: Int = R.layout.fragment_posture_list

    private lateinit var postureListViewModel: PostureListViewModel

    private val postureListAdapter: PostureListAdapter by lazy {
        PostureListAdapter(::navigateToPostureDetail)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecycler()
        setupViewModel()
    }

    private fun setupRecycler() {
        recyclerView.adapter = postureListAdapter
    }

    private fun setupViewModel() {
        postureListViewModel = viewModel(viewModelFactory.get()) {

            observe(ldPostureList, ::addPostures)

            observe(ldLoading, ::loadingUI)

            observe(ldFailure, ::handleFailure)

        }
    }

    private fun addPostures(postureList: List<PostureUI>) {
        errorLayout.gone()
        recyclerView.visible()
        postureListAdapter.setPostures(postureList)
    }

    private fun loadingUI(isLoading: Boolean) {
        if (isLoading) {
            recyclerView.gone()
            progressBar.visible()
        } else {
            progressBar.gone()
        }
    }

    private fun handleFailure(failure: Failure) {
        when (failure) {
            is Failure.FailureWithMessage -> {
                recyclerView.gone()
                errorLayout.visible()
                errorMessage.text = failure.msg
                retryBtn.setOnClickListener { failure.retryAction() }
            }
        }
    }

    private fun navigateToPostureDetail(posture: PostureUI) {
        pushStack(
            fragment = PostureDetailFragment.getFragment(posture.id),
            sharedView = postureImv,
            sharedViewName = getString(R.string.share_name_posture_image)
        )
    }

}