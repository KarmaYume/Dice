package app.one.randomnumber

import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
   @Test
   fun generates_number() {
       val dice = Dice(6)
       val output = dice.roll()
       assertTrue("The number is not in between 1 and 6 " , output in 1..6)
   }
}