package com.ruben.data.postures

import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.whenever
import com.ruben.data.extensions.assertGeneralsSuccess
import com.ruben.data.extensions.getSingleListResultSuccess
import com.ruben.data.extensions.getSingleResultSuccess
import com.ruben.data.postures.datasource.PosturesRemoteDataSource
import com.ruben.data.postures.entity.PosturesFactory.Companion.providesPostureDetail
import com.ruben.data.postures.entity.PosturesFactory.Companion.providesPostureList
import com.ruben.data.postures.entity.PosturesResponseFactory
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentMatchers
import org.mockito.ArgumentMatchers.*
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class PosturesRepositoryImplUnitTest {

    private lateinit var posturesRepositoryImpl: PosturesRepositoryImpl

    @Mock
    private lateinit var posturesRemoteDataSource: PosturesRemoteDataSource

    @Before
    fun setUp() {
        posturesRepositoryImpl = PosturesRepositoryImpl(posturesRemoteDataSource)
    }

    @Test
    fun `getPostures should return a list of postures`() {
        whenever(posturesRemoteDataSource.getPostures())
            .doReturn(getSingleListResultSuccess(providesPostureList()))

        val testObserver = posturesRemoteDataSource.getPostures().test()

        testObserver.assertGeneralsSuccess {
            it.isNotEmpty()
        }
    }

    @Test
    fun `getPostureDetail should return a posture detail`() {
        val postureId = "5df111bd23f72ffeefe0fa31"
        whenever(posturesRemoteDataSource.getPostureDetail(anyString()))
            .doReturn(getSingleResultSuccess(providesPostureDetail()))

        val testObserver = posturesRemoteDataSource.getPostureDetail(postureId).test()

        testObserver.assertGeneralsSuccess {
            it.id == postureId
        }
    }

}