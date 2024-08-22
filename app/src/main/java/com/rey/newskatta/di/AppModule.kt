package com.rey.newskatta.di

import android.app.Application
import com.rey.newskatta.data.manager.LocalUserManagerImpl
import com.rey.newskatta.domain.manager.LocalUserManager
import com.rey.newskatta.domain.usecases.app_entry.AppEntryUseCases
import com.rey.newskatta.domain.usecases.app_entry.ReadAppEntry
import com.rey.newskatta.domain.usecases.app_entry.SaveAppEntry
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