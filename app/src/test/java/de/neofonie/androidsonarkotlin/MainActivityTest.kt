package de.neofonie.androidsonarkotlin

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.android.controller.ActivityController
import org.robolectric.annotation.Config

/**
 * Created by marcinbak on 17.01.18.
 */
@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class, sdk = intArrayOf(19, 21))
class MainActivityTest {

  private lateinit var controller: ActivityController<MainActivity>
  private lateinit var activity: MainActivity

  @Before
  fun setup() {
    controller = Robolectric.buildActivity(MainActivity::class.java).create()
    activity = controller.get()
  }

  @Test
  fun testActivityLifecycle() {
    controller.start().visible()
    controller.stop().destroy()
  }
}
