package com.ruben.domain.postures.usecase

import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.whenever
import com.ruben.domain.extensions.assertGeneralsSuccess
import com.ruben.domain.extensions.getSingleListSuccess
import com.ruben.domain.extensions.testAwait
import com.ruben.domain.postures.entity.PosturesFactory.Companion.providesPostureList
import com.ruben.domain.postures.repository.PosturesRepository
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class GetPostureListUseCaseUnitTest {

    private lateinit var getPostureListUseCase: GetPostureListUseCase

    @Mock
    private lateinit var posturesRepository: PosturesRepository

    @Before
    fun setUp() {
        getPostureListUseCase = GetPostureListUseCase(posturesRepository)
    }

    @Test
    fun `invoke should return a list of postures`() {
        whenever(posturesRepository.getPostures())
            .doReturn(getSingleListSuccess(providesPostureList()))

        val testObserver = getPostureListUseCase(Unit).testAwait()

        testObserver.assertGeneralsSuccess {
            it.isNotEmpty()
        }
    }

}