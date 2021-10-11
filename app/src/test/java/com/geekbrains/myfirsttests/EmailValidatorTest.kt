package com.geekbrains.myfirsttests

import org.junit.Assert.*
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.com"))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.co.uk"))
    }

    @Test
    fun emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email"))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email..com"))
    }

    @Test
    fun emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("@email.com"))
    }

    @Test
    fun emailValidator_EmptyString_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun emailValidator_NullEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(null))
    }

    @Test
    fun emailValidator_InvalidEmailNoDomain_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@"))
    }

    @Test
    fun emailValidator_InvalidEmailRussianFont_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("иван@email.com"))
    }

    @Test
    fun `synthetic test returns same array`() {
        val expectedArray: Array<Int> = arrayOf(42)
        assertArrayEquals(expectedArray, EmailValidator.testArray(expectedArray))
    }

    @Test
    fun `synthetic test returns sorted array`() {
        val actualArray: Array<Int> = arrayOf(3, 42, 1)
        val expectedArray: Array<Int> = arrayOf(1, 3, 42)
        assertEquals(expectedArray, EmailValidator.testArray(actualArray))
    }

    @Test
    fun `synthetic test returns NotEquals array`() {
        val actualArray: Array<Int> = arrayOf(3, 42, 1)
        val expectedArray: Array<Int> = arrayOf(3, 42, 1)
        assertNotEquals(expectedArray, EmailValidator.testArray(actualArray))
    }

    @Test
    fun `synthetic test for array returns null`() {
        val expectedArray: Array<Int> = arrayOf()
        assertNull(EmailValidator.testArray(expectedArray))
    }

    @Test
    fun `synthetic test returns null`() {
        assertNull(EmailValidator.test(3))
    }

    @Test
    fun `synthetic test returns not null`() {
        assertNotNull(EmailValidator.test(2))
    }

    @Test
    fun `synthetic test returns ourselves`() {
        val test = 1
        assertSame(test, EmailValidator.test(test))
    }
}
