package com.rey.newskatta.domain.usecases.app_entry

import com.rey.newskatta.domain.manager.LocalUserManager

class SaveAppEntry(private val localUserManager: LocalUserManager) {

    suspend operator fun invoke() {
        localUserManager.saveAppEntry()
    }
}