package de.neofonie.androidlibrary

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class SomeBusinessLogicTest {

  private lateinit var someBusinessLogic: SomeBusinessLogic

  @Before
  fun setUp() {
    someBusinessLogic = SomeBusinessLogic()
  }

  @Test
  fun crazyComplicatedLogic() {
    // Having
    val a = 1
    val b = 3

    // When
    val result = someBusinessLogic.crazyComplicatedLogic(a, b)

    // Then
    assertEquals("13", result)
  }

}