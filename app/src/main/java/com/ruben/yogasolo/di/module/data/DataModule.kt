package com.ruben.yogasolo.di.module.data

import dagger.Module

@Module(
    includes = [
        NetModule::class,
        RepositoryModule::class,
        ApiModule::class
    ]
)
class DataModule