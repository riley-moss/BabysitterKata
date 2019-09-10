package com.rmoss.babysitterkata

import org.junit.Test

import org.junit.Assert.*

class BabysitterTests {
    @Test
    fun `given zero hours worked, get paid zero dollars`() {
        val sitter = Babysitter()

        assertEquals(0, sitter.calculatePay(0))
    }
}
