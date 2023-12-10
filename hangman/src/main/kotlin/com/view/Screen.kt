package com.view

import com.service.ScreenService

object Screen {

    fun StartGame() {
        val ss = ScreenService()
        ss.PlayGame()
    }
}