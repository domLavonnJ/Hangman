package com.service

import com.constants.Constants
import com.model.Player
import java.util.Scanner

class ScreenService {
    fun totalLetters(letter: String, pword: String): Int {
        var count = 0

        pword.map { if(it.toString() == letter) {
          count++
       }
     }
        return count
    }

    fun showLossMessage(gameOver: Boolean): String {
        if (gameOver) return Constants.LOSER
        return Constants.WINNER
    }


    fun PlayGame() {
        var playerPick: String?
        var player: Player
        var askAgain = true
        var wordCount = 0
        var guessLetAmt = 0
        var guessAmount = 5
        var isWinner = false
        var gameOver = false

        println(Constants.NAME_QUESTION)
        playerPick = readLine()
        while( ((playerPick != Integer.toString(0) || playerPick != "Exit") && isWinner == false && gameOver == false)  ) {
            player = Player(playerPick!!)
            var pickedWord = player.SelectWord()
            wordCount = pickedWord.length

            println("Hello ${player.name}!, ${Constants.PICKED_LETTER}")
            playerPick = readLine()

            while(playerPick!!.length == 1 && guessAmount != 0) {
                guessLetAmt = totalLetters(playerPick, pickedWord )

                if(playerPick in pickedWord  ) {
                    wordCount = wordCount - guessLetAmt
                    if(wordCount == 0){
                        isWinner = true
                        break
                    }
                    println("Correct! you have ${wordCount} letters left to guess!")
                    println("${Constants.PICKED_LETTER}")
                    playerPick = readLine()

                }else {
                    if(guessAmount == 1){
                        gameOver = true
                        break
                    }else {
                        println(Constants.WRONG_PICK)
                        println("${Constants.PICKED_LETTER}")
                        println("${--guessAmount} guesses left")
                        println(pickedWord)
                        playerPick = readLine()
                    }

                }
            }

        }
        println(showLossMessage(gameOver))


    }
}