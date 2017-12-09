package de.neofonie.androidsonarkotlin

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Business Logic Test for coverage verification.
 *
 * Created by marcinbak on 09.12.17.
 */
class BusinessLogicTest {

  private lateinit var businessLogic: BusinessLogic

  @Before
  fun setup() {
    businessLogic = BusinessLogic()
  }

  @Test
  fun test_someLogic() {
    val x = 5
    val y = 4

    val result = businessLogic.moreLogic(x, y)

    assertEquals(9, result)
  }

}