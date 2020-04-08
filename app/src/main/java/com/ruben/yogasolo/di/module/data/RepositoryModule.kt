package com.ruben.yogasolo.di.module.data

import com.ruben.data.postures.PosturesRepositoryImpl
import com.ruben.domain.postures.repository.PosturesRepository
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {

    @Binds
    abstract fun postures(posturesRepositoryImpl: PosturesRepositoryImpl): PosturesRepository

}