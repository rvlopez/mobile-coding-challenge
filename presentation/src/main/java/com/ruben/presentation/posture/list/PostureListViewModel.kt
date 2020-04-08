package com.ruben.presentation.posture.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ruben.domain.postures.usecase.GetPostureListUseCase
import com.ruben.presentation.base.viewmodel.BaseViewModel
import com.ruben.presentation.posture.entity.PostureUI
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.addTo
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class PostureListViewModel @Inject constructor(
    private val getPostureListUseCase: GetPostureListUseCase
) : BaseViewModel() {

    private val _ldPostureList = MutableLiveData<List<PostureUI>>()
    val ldPostureList: LiveData<List<PostureUI>> = _ldPostureList

    init {
        getPostureList()
    }

    private fun getPostureList() {
        getPostureListUseCase(Unit)
            .map { postureList ->
                postureList.map { PostureMapper().mapToUI(it) }
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { loading(true) }
            .doAfterTerminate { loading(false) }
            .subscribe({ postureUIList ->
                _ldPostureList.value = postureUIList
            }, { throwable ->
                handleFailure(throwable) { getPostureList() }
            }).addTo(compositeDisposable)
    }

}