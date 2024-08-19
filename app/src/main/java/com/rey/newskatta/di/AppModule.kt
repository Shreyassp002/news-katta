package com.rey.newskatta.di

import android.app.Application
import android.app.LocaleManager
import com.rey.newskatta.data.manager.LocalUserManagerImpl
import com.rey.newskatta.domain.manager.LocalUserManager
import com.rey.newskatta.domain.usecases.AppEntryUseCases
import com.rey.newskatta.domain.usecases.ReadAppEntry
import com.rey.newskatta.domain.usecases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManger(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    ) = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )
}