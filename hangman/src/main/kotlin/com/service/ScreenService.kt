package com.service

import com.constants.Constants
import com.model.Player

class ScreenService {


    fun PlayGame() {
        var playerPick: String?
        var player: Player

        println(Constants.NAME_QUESTION)
        playerPick = readLine()
        while(playerPick != Integer.toString(0) || playerPick != "Exit") {
            player = Player(playerPick!!)
            println(Constants.PICKED_WORD + )

        }


    }
}