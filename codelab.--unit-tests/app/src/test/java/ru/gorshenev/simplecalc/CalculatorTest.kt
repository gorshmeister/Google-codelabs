package ru.gorshenev.simplecalc

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.closeTo
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun addTwoNumbers() {
        val num1 = 1.0
        val num2 = 1.0
        val expected = 2.0
        val result = calculator.add(num1, num2)
        assertThat(result, `is`(equalTo(expected)))
    }

    @Test
    fun addTwoNumbersNegative() {
        val num1 = -1.0
        val num2 = 2.0
        val expected = 1.0
        val result = calculator.add(num1, num2)
        assertThat(result, `is`(equalTo(expected)))
    }

    @Test
    fun addTwoNumbersFloats() {
        val num1 = 1.111f.toDouble()
        val num2 = 1.111
        val expected = 2.222
        val resultAdd: Double = calculator.add(num1, num2)
        assertThat(resultAdd, `is`(closeTo(expected, 0.01)))
    }

    @Test
    fun subTwoNumbers() {
        val num1 = 3.0
        val num2 = 1.0
        val expected = 2.0
        val result = calculator.sub(num1, num2)
        assertThat(result, `is`(equalTo(expected)))
    }

    @Test
    fun subTwoNumbersWithNegativeResults() {
        val num1 = 1.0
        val num2 = 2.0
        val expected = -1.0
        val result = calculator.sub(num1, num2)
        assertThat(result, `is`(equalTo(expected)))
    }
    @Test
    fun mulTwoNumbers() {
        val num1 = 2.0
        val num2 = 3.0
        val expected = 6.0
        val result = calculator.mul(num1, num2)
        assertThat(result, `is`(equalTo(expected)))
    }

    @Test
    fun mulTwoNumbersZero() {
        val num1 = 2.0
        val num2 = 0.0
        val expected = 0.0
        val result = calculator.mul(num1, num2)
        assertThat(result, `is`(equalTo(expected)))
    }

    @Test
    fun divTwoNumbers() {
        val num1 = 6.0
        val num2 = 2.0
        val expected = 3.0
        val result = calculator.div(num1, num2)
        assertThat(result, `is`(equalTo(expected)))
    }

    @Test
    fun divByZeroThrows() {
        val num1 = 6.0
        val num2 = 0.0
        val expected = IllegalArgumentException::class.java
        val result = calculator.div(num1, num2)
        assertThat(result, `is`(equalTo(expected)))
    }

    @Test
    fun powTwoNumbers() {
        val num1 = 4.0
        val num2 = 2.0
        val expected = 16.0
        val result = calculator.pow(num1, num2)
        assertThat(result, `is`(equalTo(expected)))
    }

    @Test
    fun powTwoNumbersNegative() {
        val num1 = -4.0
        val num2 = 2.0
        val expected = 16.0
        val result = calculator.pow(num1, num2)
        assertThat(result, `is`(equalTo(expected)))
    }

    @Test
    fun powTwoNumbersNegative2() {
        val num1 = 4.0
        val num2 = -2.0
        val expected = 0.0625
        val result = calculator.pow(num1, num2)
        assertThat(result, `is`(equalTo(expected)))
    }

    @Test
    fun powZeroNumbers() {
        val num1 = 0.0
        val num2 = 2.0
        val expected = 0.0
        val result = calculator.pow(num1, num2)
        assertThat(result, `is`(equalTo(expected)))
    }

    @Test
    fun powZeroNumbers2() {
        val num1 = 4.0
        val num2 = 0.0
        val expected = 1.0
        val result = calculator.pow(num1, num2)
        assertThat(result, `is`(equalTo(expected)))
    }

    @Test
    fun powZeroAndNegativeNumbers() {
        val num1 = 0.0
        val num2 = -2.0
        val expected = Double.POSITIVE_INFINITY
        val result = calculator.pow(num1, num2)
        assertThat(result, `is`(equalTo(expected)))
    }

    @Test
    fun powNegativeNumbers() {
        val num1 = -2.0
        val num2 = -2.0
        val expected = 0.25
        val result = calculator.pow(num1, num2)
        assertThat(result, `is`(equalTo(expected)))
    }

}