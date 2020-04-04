package com.ruben.domain.postures.repository

import com.ruben.domain.postures.entity.Posture
import com.ruben.domain.postures.entity.PostureDetail
import io.reactivex.Single

interface PosturesRepository {

    fun getPostures(): Single<List<Posture>>

    fun getPostureDetail(id: String): Single<PostureDetail>

}