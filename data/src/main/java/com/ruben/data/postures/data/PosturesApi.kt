package com.ruben.data.postures.data

import com.ruben.data.postures.entity.PostureDetailResponse
import com.ruben.data.postures.entity.PostureResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

private const val MOCKY_POSTURE_ID = "5e8daba1310000fc65429b03"
private const val MOCKY_POSTURE_DETAIL_ID = "5e8dad013100007767429b18"

interface PosturesApi {

    @GET(MOCKY_POSTURE_ID)
    fun postures(): Single<List<PostureResponse>>

    @GET(MOCKY_POSTURE_DETAIL_ID)
    fun postureDetail(
        @Query("_id") id: String
    ): Single<List<PostureDetailResponse>>

}