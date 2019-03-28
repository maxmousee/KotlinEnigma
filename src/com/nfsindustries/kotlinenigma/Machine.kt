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

    fun encrypt(inputMessage: String) : String {
        var encryptedMessage = "a"
        if (inputMessage.isNullOrEmpty()) {
            return ""
        }

        for (i in 0..inputMessage.length) {
            val currentChar = inputMessage.get(i)
            val enctryptedChar = firstRotor.getEncryptedCharFor(currentChar)
            encryptedMessage += enctryptedChar
            turnRotors()
        }
        return encryptedMessage
    }

}