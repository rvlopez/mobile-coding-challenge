package com.ruben.domain.postures.usecase

import com.ruben.domain.base.usecase.SingleUseCase
import com.ruben.domain.postures.entity.PostureDetail
import com.ruben.domain.postures.repository.PosturesRepository
import io.reactivex.Single
import javax.inject.Inject

class GetPostureDetailUseCase @Inject constructor(
    private val posturesRepository: PosturesRepository
) : SingleUseCase<PostureDetail, GetPostureDetailParams> {

    override fun invoke(params: GetPostureDetailParams): Single<PostureDetail> =
        posturesRepository.getPostureDetail(params.id)

}

inline class GetPostureDetailParams(val id: String)