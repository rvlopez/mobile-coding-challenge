package com.ruben.yogasolo.di.module.presentation

import com.ruben.presentation.MainActivity
import com.ruben.yogasolo.di.scope.PerView
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @PerView
    @ContributesAndroidInjector
    abstract fun main(): MainActivity

}