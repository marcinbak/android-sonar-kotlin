package de.neofonie.androidsonarkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import java.util.concurrent.atomic.AtomicInteger

/**
 * Main activity class
 */
class MainActivity : AppCompatActivity() {

  private lateinit var logic: BusinessLogic

  private val counter: AtomicInteger = AtomicInteger(0)

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    logic = BusinessLogic()
  }

  override fun onStart() {
    super.onStart()
    counter.incrementAndGet()
    logic.someLogic(BuildConfig.VERSION_NAME, BuildConfig.VERSION_CODE)
  }

  override fun onStop() {
    super.onStop()
    logic.moreLogic(counter.get(), counter.decrementAndGet())
  }
}
