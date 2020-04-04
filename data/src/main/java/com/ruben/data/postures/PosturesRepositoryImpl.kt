package com.ruben.data.postures

import com.ruben.data.postures.datasource.PosturesRemoteDataSource
import com.ruben.domain.postures.entity.Posture
import com.ruben.domain.postures.entity.PostureDetail
import com.ruben.domain.postures.repository.PosturesRepository
import io.reactivex.Single
import javax.inject.Inject

class PosturesRepositoryImpl @Inject constructor(
    private val posturesRemoteDataSource: PosturesRemoteDataSource
) : PosturesRepository {

    override fun getPostures(): Single<List<Posture>> =
        posturesRemoteDataSource.getPostures()

    override fun getPostureDetail(id: String): Single<PostureDetail> =
        posturesRemoteDataSource.getPostureDetail(id = id)

}