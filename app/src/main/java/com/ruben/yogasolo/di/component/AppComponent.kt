package com.ruben.yogasolo.di.component

import com.ruben.yogasolo.application.YogaSoloApplication
import com.ruben.yogasolo.di.module.data.DataModule
import com.ruben.yogasolo.di.module.presentation.ActivityModule
import com.ruben.yogasolo.di.module.presentation.AppModule
import com.ruben.yogasolo.di.module.presentation.FragmentModule
import com.ruben.yogasolo.di.module.presentation.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        DataModule::class,
        ViewModelModule::class,
        ActivityModule::class,
        FragmentModule::class
    ]
)
interface AppComponent : AndroidInjector<YogaSoloApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(app: YogaSoloApplication): Builder

        fun build(): AppComponent
    }

}