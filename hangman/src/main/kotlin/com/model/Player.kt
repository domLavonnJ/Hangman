package com.model

import com.constants.WordsConstants

data class Player(var name:String, var score:Int = 0) {
    var pastWords: MutableList<String> = mutableListOf()

    val wordList = WordsConstants
    fun listPastWords() = println(pastWords)

}