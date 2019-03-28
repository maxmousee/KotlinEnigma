package com.nfsindustries.kotlinenigma

import org.junit.jupiter.api.Test
import kotlin.test.assertNotNull

internal class RotorTest {

    @Test
    fun testFirstChar() {
        val rotor = Rotor(0)
        val encrypted = rotor.getFirstEncryptedChar()
        assertNotNull(encrypted)
    }

    @Test
    fun testFirstCharFor() {
        val rotor = Rotor(0)
        val encrypted = rotor.getEncryptedCharFor('a')
        assertNotNull(encrypted)
    }
}