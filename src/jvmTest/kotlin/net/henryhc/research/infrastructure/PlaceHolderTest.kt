package net.henryhc.research.infrastructure

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PlaceHolderTest {

    @Test
    fun add() {
        val cut = PlaceHolder()

        assertEquals(3, cut.add(1, 2))
    }
}