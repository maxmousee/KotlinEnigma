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
        println("Encrypted: $encrypted")
    }

    @Test
    fun wordEncryption() {
        val machine = Machine()
        val encrypted = machine.encrypt("helloworld")
        assertNotNull(encrypted)
        assertNotEquals("helloworld", encrypted)
        assertEquals(10, encrypted.length)
        println("Encrypted: $encrypted")
    }

    @Test
    fun encryptSameChars() {
        val machine = Machine()
        val encrypted = machine.encrypt("aaa")
        assertNotNull(encrypted)
        assertNotEquals("aaa", encrypted)
        assertEquals(3, encrypted.length)
        println("Encrypted: $encrypted")
    }

    @Test
    fun encryptBoundaries() {
        val machine = Machine()
        val encrypted = machine.encrypt("aAzZ")
        assertNotNull(encrypted)
        assertNotEquals("aAzZ", encrypted)
        assertEquals(4, encrypted.length)
        println("Encrypted: $encrypted")
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