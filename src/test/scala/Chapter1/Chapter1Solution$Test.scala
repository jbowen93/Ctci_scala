package Chapter1

import org.scalatest.FunSuite

class Chapter1Solution$Test extends FunSuite {

  val testObject = new Chapter1Solution

  //Question 1.1 Functional Tests
  test("Functional method called on string with repeated chars") {
    assert(testObject.isUniqueCharFunctional("aabbcc") === false)
  }

  test("Functional method called on string with unique chars") {
    assert(testObject.isUniqueCharFunctional("abcdefg") === true)
  }

  //Question 1.1 Imperative Tests
  test("Imperative method called on string with repeated chars") {
    assert(testObject.isUniqueChar("aabbcc") === false)
  }

  test("Imperative method called on string with unique chars") {
    assert(testObject.isUniqueChar("abcdefg") === true)
  }

  //Question 1.2 Functional Tests

  //Question 1.3 Tests

  //etc
}
