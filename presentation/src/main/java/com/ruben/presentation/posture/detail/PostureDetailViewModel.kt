package com.ruben.presentation.posture.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ruben.domain.postures.entity.PostureDetail
import com.ruben.domain.postures.usecase.GetPostureDetailParams
import com.ruben.domain.postures.usecase.GetPostureDetailUseCase
import com.ruben.presentation.base.viewmodel.BaseViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.addTo
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class PostureDetailViewModel @Inject constructor(
    private val getPostureDetailUseCase: GetPostureDetailUseCase
) : BaseViewModel() {

    private val _ldPostureDetail = MutableLiveData<PostureDetail>()
    val ldPostureDetail: LiveData<PostureDetail> = _ldPostureDetail

    fun getPostureDetails(id: String) {
        getPostureDetailUseCase(GetPostureDetailParams(id))
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { loading(true) }
            .doAfterTerminate { loading(false) }
            .subscribe({ postureDetails ->
                _ldPostureDetail.value = postureDetails
            }, { throwable ->
                handleFailure(throwable) { getPostureDetails(id) }
            }).addTo(compositeDisposable)
    }

}