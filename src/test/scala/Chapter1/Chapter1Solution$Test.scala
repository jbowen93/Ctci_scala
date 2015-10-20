package Chapter1

import org.scalatest.FunSuite

class Chapter1Solution$Test extends FunSuite {

  val testObject = new Chapter1Solution

  test("IsUniqueChar called on string with repeated chars") {
    assert(testObject.isUniqueChar("titties") === false)
  }

  test("isUniqueChar called on string with unique chars") {
    assert(testObject.isUniqueChar("abcdefg") === true)
  }

}
