package com.ruben.data.postures.datasource

import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.whenever
import com.ruben.data.extensions.assertGeneralsSuccess
import com.ruben.data.extensions.getSingleListResultSuccess
import com.ruben.data.extensions.getSingleResultSuccess
import com.ruben.data.postures.data.PosturesApi
import com.ruben.data.postures.entity.PosturesResponseFactory.Companion.providesPostureDetailListResponse
import com.ruben.data.postures.entity.PosturesResponseFactory.Companion.providesPostureListResponse
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class PosturesRemoteDataSourceUnitTest {

    private lateinit var posturesRemoteDataSource: PosturesRemoteDataSource

    @Mock
    private lateinit var posturesApi: PosturesApi

    @Before
    fun setUp() {
        posturesRemoteDataSource = PosturesRemoteDataSource(posturesApi)
    }

    @Test
    fun `getPostures should return a list of postures`() {
        whenever(posturesApi.postures())
            .doReturn(getSingleListResultSuccess(providesPostureListResponse()))

        val testObserver = posturesRemoteDataSource.getPostures().test()

        testObserver.assertGeneralsSuccess {
            it.isNotEmpty()
        }
    }

    @Test
    fun `getPostureDetail should return a posture detail`() {
        val postureId = "5df111bd23f72ffeefe0fa31"
        whenever(posturesApi.postureDetail(anyString()))
            .doReturn(getSingleResultSuccess(providesPostureDetailListResponse()))

        val testObserver = posturesRemoteDataSource.getPostureDetail(postureId).test()

        testObserver.assertGeneralsSuccess {
            it.id == postureId
        }
    }

}