package com.ruben.yogasolo.di.module.presentation

import com.ruben.presentation.posture.detail.PostureDetailFragment
import com.ruben.presentation.posture.list.PostureListFragment
import com.ruben.yogasolo.di.scope.PerView
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @PerView
    @ContributesAndroidInjector
    abstract fun postureList(): PostureListFragment

    @PerView
    @ContributesAndroidInjector
    abstract fun postureDetail(): PostureDetailFragment

}