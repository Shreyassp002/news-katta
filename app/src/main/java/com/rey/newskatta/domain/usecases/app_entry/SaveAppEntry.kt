package com.rey.newskatta.domain.usecases.app_entry

import com.rey.newskatta.domain.manager.LocalUserManger
import javax.inject.Inject


class SaveAppEntry @Inject constructor(
    private val localUserManger: LocalUserManger
) {

    suspend operator fun invoke(){
        localUserManger.saveAppEntry()
    }

}