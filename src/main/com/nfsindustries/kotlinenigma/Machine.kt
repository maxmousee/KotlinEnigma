package com.nfsindustries.kotlinenigma

class Machine() {
    private val firstRotor = Rotor(0)
    private val secondRotor = Rotor(1)

    private fun turnRotors() {
        val fullTurn = firstRotor.click()
        if (fullTurn) {
            secondRotor.click()
        }
    }

    fun encrypt(inputMessage: String) : String {
        var encryptedMessage = ""
        if (inputMessage.isEmpty()) {
            return ""
        }

        for (i in 0 until inputMessage.length) {
            val currentChar = inputMessage.get(i)
            val encryptedChar = firstRotor.getEncryptedCharFor(currentChar)
            encryptedMessage += encryptedChar
            turnRotors()
        }
        return encryptedMessage
    }

}