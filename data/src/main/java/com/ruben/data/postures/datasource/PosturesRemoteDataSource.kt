package com.ruben.data.postures.datasource

import com.ruben.data.postures.data.PosturesApi
import com.ruben.domain.postures.entity.Posture
import com.ruben.domain.postures.entity.PostureDetail
import io.reactivex.Single
import javax.inject.Inject

class PosturesRemoteDataSource @Inject constructor(
    private val posturesApi: PosturesApi
) {

    fun getPostures(): Single<List<Posture>> =
        posturesApi.postures().map { postures ->
            postures.map { it.toDomain() }
        }

    fun getPostureDetail(id: String): Single<PostureDetail> =
        posturesApi.postureDetail(id = id)
            .flatMap { postureDetailList ->
                Single.just(postureDetailList.first { it.id == id }.toDomain())
            }

}