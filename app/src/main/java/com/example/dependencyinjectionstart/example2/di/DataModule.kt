package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.data.datasource.*
import dagger.Binds
import dagger.Module

@Module
interface DataModule{


    @ApplicationScope
    @Binds
    fun bindLocalRepository(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ProdQualifiers
    @ApplicationScope
    @Binds
    fun bindRemoteRepository(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @TestQualifiers
    @ApplicationScope
    @Binds
    fun bindTestRepository(impl: TestRemoteDataSourceImpl): ExampleRemoteDataSource
}