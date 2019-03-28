package com.nfsindustries.kotlinenigma

import org.junit.jupiter.api.Test
import kotlin.test.assertNotEquals
import kotlin.test.assertNotNull

internal class MachineTest {

    @Test
    fun simpleEncryption() {
        val machine = Machine()
        val encrypted = machine.encrypt("abc")
        assertNotNull(encrypted)
        assertNotEquals("abc", encrypted)
    }

    @Test
    fun encryptBoundaries() {
        val machine = Machine()
        val encrypted = machine.encrypt("aAzZ")
        assertNotNull(encrypted)
        assertNotEquals("aAzZ", encrypted)
    }
}