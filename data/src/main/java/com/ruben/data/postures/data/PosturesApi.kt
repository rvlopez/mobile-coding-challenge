package com.ruben.data.postures.data

import com.ruben.data.postures.entity.PostureDetailResponse
import com.ruben.data.postures.entity.PostureResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface PosturesApi {

    @GET("postures")
    fun postures(): Single<List<PostureResponse>>

    @GET("posture_detail")
    fun postureDetail(
        @Query("_id") id: String
    ): Single<PostureDetailResponse>

}