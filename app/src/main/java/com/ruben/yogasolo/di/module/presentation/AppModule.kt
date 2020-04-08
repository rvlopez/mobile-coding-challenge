package com.ruben.yogasolo.di.module.presentation

import android.app.Application
import android.content.Context
import android.content.res.Resources
import com.ruben.yogasolo.application.YogaSoloApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideApplication(application: YogaSoloApplication): Application = application

    @Provides
    @Singleton
    fun provideContext(application: Application): Context = application

    @Provides
    @Singleton
    fun resources(application: Application): Resources = application.resources

}