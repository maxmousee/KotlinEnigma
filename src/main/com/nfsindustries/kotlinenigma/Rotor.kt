package com.nfsindustries.kotlinenigma

class Rotor(number: Int) {

    private val charToASCII = 97
    private var position = 0
    private val rotorNo = number
    var wiring = Array(size = 26, init = {0})

    init {
        when (rotorNo) {
            0 -> {
                wiring[0] = 15
                wiring[1] = 4
                wiring[2] = 25
                wiring[3] = 20
                wiring[4] = 14
                wiring[5] = 7
                wiring[6] = 23
                wiring[7] = 18
                wiring[8] = 2
                wiring[9] = 21
                wiring[10] = 5
                wiring[11] = 12
                wiring[12] = 19
                wiring[13] = 1
                wiring[14] = 6
                wiring[15] = 11
                wiring[16] = 17
                wiring[17] = 8
                wiring[18] = 13
                wiring[19] = 16
                wiring[20] = 9
                wiring[21] = 22
                wiring[22] = 0
                wiring[23] = 24
                wiring[24] = 3
                wiring[25] = 10
            }
            1 -> {
                wiring[0] = 25
                wiring[1] = 14
                wiring[2] = 20
                wiring[3] = 4
                wiring[4] = 18
                wiring[5] = 24
                wiring[6] = 3
                wiring[7] = 10
                wiring[8] = 5
                wiring[9] = 22
                wiring[10] = 15
                wiring[11] = 2
                wiring[12] = 8
                wiring[13] = 16
                wiring[14] = 23
                wiring[15] = 7
                wiring[16] = 12
                wiring[17] = 21
                wiring[18] = 1
                wiring[19] = 11
                wiring[20] = 6
                wiring[21] = 13
                wiring[22] = 9
                wiring[23] = 17
                wiring[24] = 0
                wiring[25] = 19
            }
            2 -> {
                wiring[0] = 4
                wiring[1] = 7
                wiring[2] = 17
                wiring[3] = 21
                wiring[4] = 23
                wiring[5] = 6
                wiring[6] = 0
                wiring[7] = 14
                wiring[8] = 1
                wiring[9] = 16
                wiring[10] = 20
                wiring[11] = 18
                wiring[12] = 8
                wiring[13] = 12
                wiring[14] = 25
                wiring[15] = 5
                wiring[16] = 11
                wiring[17] = 24
                wiring[18] = 13
                wiring[19] = 22
                wiring[20] = 10
                wiring[21] = 19
                wiring[22] = 15
                wiring[23] = 3
                wiring[24] = 9
                wiring[25] = 2
            }
            3 -> {
                wiring[0] = 8
                wiring[1] = 12
                wiring[2] = 4
                wiring[3] = 19
                wiring[4] = 2
                wiring[5] = 6
                wiring[6] = 5
                wiring[7] = 17
                wiring[8] = 0
                wiring[9] = 24
                wiring[10] = 18
                wiring[11] = 16
                wiring[12] = 1
                wiring[13] = 25
                wiring[14] = 23
                wiring[15] = 22
                wiring[16] = 11
                wiring[17] = 7
                wiring[18] = 10
                wiring[19] = 3
                wiring[20] = 21
                wiring[21] = 20
                wiring[22] = 15
                wiring[23] = 14
                wiring[24] = 9
                wiring[25] = 13
            }
            4 -> {
                wiring[0] = 16
                wiring[1] = 22
                wiring[2] = 4
                wiring[3] = 17
                wiring[4] = 19
                wiring[5] = 25
                wiring[6] = 20
                wiring[7] = 8
                wiring[8] = 14
                wiring[9] = 0
                wiring[10] = 18
                wiring[11] = 3
                wiring[12] = 5
                wiring[13] = 6
                wiring[14] = 7
                wiring[15] = 9
                wiring[16] = 10
                wiring[17] = 15
                wiring[18] = 24
                wiring[19] = 23
                wiring[20] = 2
                wiring[21] = 21
                wiring[22] = 1
                wiring[23] = 13
                wiring[24] = 12
                wiring[25] = 11
            }

            else -> {
                wiring[0] = 15
                wiring[1] = 4
                wiring[2] = 25
                wiring[3] = 20
                wiring[4] = 14
                wiring[5] = 7
                wiring[6] = 23
                wiring[7] = 18
                wiring[8] = 2
                wiring[9] = 21
                wiring[10] = 5
                wiring[11] = 12
                wiring[12] = 19
                wiring[13] = 1
                wiring[14] = 6
                wiring[15] = 11
                wiring[16] = 17
                wiring[17] = 8
                wiring[18] = 13
                wiring[19] = 16
                wiring[20] = 9
                wiring[21] = 22
                wiring[22] = 0
                wiring[23] = 24
                wiring[24] = 3
                wiring[25] = 10
            }
        }
    }

    ///Click rotor, returns true if the position is zero again (complete turn)
    fun click(): Boolean {
        if (position < 25) {
            position++
            return false
        } else {
            position = 0
            return true
        }
    }

    fun getFirstEncryptedChar() : Char {
        return (wiring[position] + charToASCII).toChar()
    }

    fun getEncryptedCharFor(original: Char) : Char {
        val currentCharPosition = original.toLowerCase().toInt() - charToASCII
        return (wiring[currentCharPosition] + charToASCII).toChar()
    }
}
