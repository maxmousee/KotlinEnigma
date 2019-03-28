package com.nfsindustries.kotlinenigma

class Machine() {
    private val firstRotor = Rotor(0)
    private val secondRotor = Rotor(1)


    fun turnRotors() {
        val fullTurn = firstRotor.click()
        if (fullTurn) {
            secondRotor.click()
        }
    }

}