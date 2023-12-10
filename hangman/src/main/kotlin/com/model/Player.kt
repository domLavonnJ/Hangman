package com.model

import com.constants.WordsConstants
import kotlin.random.Random
import kotlin.random.nextInt

data class Player(var name:String, var score:Int = 0) {
    var pastWords: MutableList<String> = mutableListOf()

    val wordList = WordsConstants.wordsList
    fun listPastWords() = println(pastWords)

    fun SelectWord(): String {
        val len = Random.nextInt(0 until (wordList.size - 1))
        return wordList[len]
    }

}