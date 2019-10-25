package com.rmoss.babysitterkata

import org.junit.Test

import org.junit.Assert.*

class BabysitterTests {
    @Test
    fun `given zero hours worked, get paid zero dollars`() {
        val sitter = Babysitter()

        assertEquals(0, sitter.calculatePay(0, 10))
    }

    @Test
    fun `given one hour worked at a rate per hour, sitter gets paid for hourly rate`() {
        val sitter = Babysitter()

        assertEquals(10, sitter.calculatePay(1, 10))
    }

    @Test
    fun `given one hour worked at a different rate, sitter gets paid for hourly rate`() {
        val sitter = Babysitter()

        assertEquals(20, sitter.calculatePay(1, 20))
    }
}
