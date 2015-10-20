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

  //Question 1.6 Tests
  test("Rotate Matrix") {
    val matrix = Array.ofDim[Int](3, 3)
    matrix(0)(0) = 1; matrix(0)(1) = 2; matrix(0)(2) = 3
    matrix(1)(0) = 4; matrix(1)(1) = 5; matrix(1)(2) = 6
    matrix(2)(0) = 7; matrix(2)(1) = 8; matrix(2)(2) = 9

    val rotatedMatrix = Array.ofDim[Int](3, 3)
    rotatedMatrix(0)(0) = 7; rotatedMatrix(0)(1) = 4; rotatedMatrix(0)(2) = 1
    rotatedMatrix(1)(0) = 8; rotatedMatrix(1)(1) = 5; rotatedMatrix(1)(2) = 2
    rotatedMatrix(2)(0) = 9; rotatedMatrix(2)(1) = 6; rotatedMatrix(2)(2) = 3

    assert(testObject.matrixRotate(matrix, 3) === rotatedMatrix)
  }

  //Question 1.7 Tests
  test("Set rows and columns to 0"){
    val matrix = Array.ofDim[Int](3, 3)
    matrix(0)(0) = 1; matrix(0)(1) = 1; matrix(0)(2) = 1
    matrix(1)(0) = 1; matrix(1)(1) = 0; matrix(1)(2) = 1
    matrix(2)(0) = 1; matrix(2)(1) = 1; matrix(2)(2) = 1

    val zeroMatrix = Array.ofDim[Int](3, 3)
    zeroMatrix(0)(0) = 1; zeroMatrix(0)(1) = 0; zeroMatrix(0)(2) = 1
    zeroMatrix(1)(0) = 0; zeroMatrix(1)(1) = 0; zeroMatrix(1)(2) = 0
    zeroMatrix(2)(0) = 1; zeroMatrix(2)(1) = 0; zeroMatrix(2)(2) = 1

    assert(testObject.setZeros(matrix) === zeroMatrix)

  }
}
