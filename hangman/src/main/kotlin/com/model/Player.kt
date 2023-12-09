package com.model

data class Player(var name:String, var score:Int = 0) {
    var pastWords: MutableList<String> = mutableListOf()

    fun listPastWords() = println(pastWords)
}