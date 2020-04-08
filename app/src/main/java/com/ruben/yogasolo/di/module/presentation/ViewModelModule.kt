package com.ruben.yogasolo.di.module.presentation

import androidx.lifecycle.ViewModelProvider
import com.ruben.presentation.base.viewmodel.BaseViewModel
import com.ruben.presentation.posture.detail.PostureDetailViewModel
import com.ruben.presentation.posture.list.PostureListViewModel
import com.ruben.yogasolo.di.viewmodel.ViewModelFactory
import com.ruben.yogasolo.di.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun factory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(PostureListViewModel::class)
    abstract fun postureList(vm: PostureListViewModel): BaseViewModel

    @Binds
    @IntoMap
    @ViewModelKey(PostureDetailViewModel::class)
    abstract fun postureDetail(vm: PostureDetailViewModel): BaseViewModel

}