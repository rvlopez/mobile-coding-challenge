package com.ruben.domain.postures.usecase

import com.ruben.domain.base.usecase.SingleUseCase
import com.ruben.domain.postures.entity.Posture
import com.ruben.domain.postures.repository.PosturesRepository
import io.reactivex.Single
import javax.inject.Inject

class GetPostureListUseCase @Inject constructor(
    private val posturesRepository: PosturesRepository
) : SingleUseCase<List<Posture>, Unit> {

    override fun invoke(params: Unit): Single<List<Posture>> =
        posturesRepository.getPostures()

}