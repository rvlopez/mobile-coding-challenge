package com.ruben.yogasolo.di.module.data

import com.ruben.data.postures.data.PosturesApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class ApiModule {

    @Provides
    fun postures(retrofit: Retrofit): PosturesApi =
        retrofit.create(PosturesApi::class.java)


}