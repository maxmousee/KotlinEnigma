package com.nfsindustries.kotlinenigma

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertNotNull

internal class MachineTest {

    @Test
    fun simpleEncryption() {
        val machine = Machine()
        val encrypted = machine.encrypt("abc")
        assertNotNull(encrypted)
        assertNotEquals("abc", encrypted)
        assertEquals(3, encrypted.length)
        assertNotEquals('a', encrypted.get(0))
        assertNotEquals('b', encrypted.get(1))
        assertNotEquals('c', encrypted.get(2))
    }

    @Test
    fun encryptBoundaries() {
        val machine = Machine()
        val encrypted = machine.encrypt("aAzZ")
        assertNotNull(encrypted)
        assertNotEquals("aAzZ", encrypted)
        assertEquals(4, encrypted.length)
        assertNotEquals('a', encrypted.get(0))
        assertNotEquals('a', encrypted.get(1))
        assertNotEquals('z', encrypted.get(2))
        assertNotEquals('z', encrypted.get(3))
    }

    @Test
    fun encryptEmpty() {
        val machine = Machine()
        val encrypted = machine.encrypt("")
        assertNotNull(encrypted)
        assertEquals("", encrypted)
        assertEquals(0, encrypted.length)
    }
}