package com.rey.newskatta.domain.usecases

import com.rey.newskatta.domain.manager.LocalUserManager

class SaveAppEntry(private val localUserManager: LocalUserManager) {

    suspend operator fun invoke() {
        localUserManager.saveAppEntry()
    }
}