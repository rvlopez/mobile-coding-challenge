package com.ruben.yogasolo.di.module.data

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.ruben.data.net.BaseHttpClient
import com.ruben.data.net.BaseRetrofit
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class NetModule {

    @Provides
    @Singleton
    fun gson(): Gson = GsonBuilder().create()

    @Provides
    @Singleton
    fun okHttpClient(baseHttpClient: BaseHttpClient): OkHttpClient = baseHttpClient.okHttpClient

    @Provides
    @Singleton
    fun retrofit(baseRetrofit: BaseRetrofit): Retrofit = baseRetrofit.retrofit

}