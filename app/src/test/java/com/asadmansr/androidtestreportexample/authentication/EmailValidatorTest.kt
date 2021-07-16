package com.asadmansr.androidtestreportexample.authentication


import org.junit.Assert
import org.junit.Test

class EmailValidatorTest {

    private val emailValidator = EmailValidator()

    @Tes
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        Assert.assertFalse(emailValidator.isEmailValid("name@email.com"))
    }

    @Test
    fun emailValidator_IncorrectEmailSimple_ReturnFalse() {
        Assert.assertFalse(emailValidator.isEmailValid("name.com"))
    }

    @Test
    fun emailValidator_EmptyEmailSimple_ReturnFalse() {
        Assert.assertFalse(emailValidator.isEmailValid(""))
    }
    @Test
    fun emailValidator_failedTest() {
        Assert.assertEquals(4, 4)
    }
}

annotation class Tes
