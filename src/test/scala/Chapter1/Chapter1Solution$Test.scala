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

  //Question 1.2 was for C/C++ code so we'll be ignoring it.

  //Question 1.3 Functional Tests
  test("Functional method called where strings are permutations") {
    assert(testObject.isPermutationFunctional("abc", "cba") === true)
  }

  test("Functional method called where strings are not permutations") {
    assert(testObject.isPermutationFunctional("abcd", "zcba") === false)
  }

  //Question 1.3 Imperative Tests
  test("Imperative method called where strings are permutations") {
    assert(testObject.isPermutation("abc", "cba") === true)
  }

  test("Imperative method called where strings are not permutations") {
    assert(testObject.isPermutation("abcd", "zcba") === false)
  }

  //Question 1.4 is weird to write out but pretty easy to explain. Skipping it.

  //Question 1.5 Tests
  test("Compress string where compressed length would be longer") {
    assert(testObject.compressString("abcd") === "abcd")
  }

  test("Compress string where compressed length would be shorter") {
    assert(testObject.compressString("aaabbb") === "a3b3")
  }

  test("Compress blank string") {
    assert(testObject.compressString("") === "")
  }
}
