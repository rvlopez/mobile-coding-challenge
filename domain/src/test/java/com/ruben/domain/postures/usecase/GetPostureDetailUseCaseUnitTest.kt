package com.ruben.domain.postures.usecase

import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.whenever
import com.ruben.domain.extensions.assertGeneralsSuccess
import com.ruben.domain.extensions.getSingleSuccess
import com.ruben.domain.extensions.testAwait
import com.ruben.domain.postures.entity.PosturesFactory.Companion.providesPostureDetail
import com.ruben.domain.postures.repository.PosturesRepository
import org.junit.Before

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class GetPostureDetailUseCaseUnitTest {

    private lateinit var getPostureDetailUseCase: GetPostureDetailUseCase

    @Mock
    private lateinit var posturesRepository: PosturesRepository

    @Before
    fun setUp() {
        getPostureDetailUseCase = GetPostureDetailUseCase(posturesRepository)
    }

    @Test
    fun `invoke should return a posture detail`() {
        val postureId = "5df111bd23f72ffeefe0fa31"
        whenever(posturesRepository.getPostureDetail(anyString()))
            .doReturn(getSingleSuccess(providesPostureDetail()))

        val testObserver = getPostureDetailUseCase(GetPostureDetailParams(postureId)).testAwait()

        testObserver.assertGeneralsSuccess {
            it.id == postureId
        }
    }

}