package Chapter1

class Chapter1Solution {

  //Problem 1.1 Functional Solution
  def isUniqueCharFunctional(str: String) = {
    str.distinct == str
  }

  //Problem 1.1 Imperative Solution
  def isUniqueChar(str: String) = {
    var ret = true
    if (str.length > 256) {
      ret = false
    }
    val charSet = new Array[Boolean](256)
    for((value,index) <- str.view.zipWithIndex) {
      if (charSet(value)) {
        ret = false
      }
      charSet(value) = true
    }
    ret
  }

  //Problem 1.2 was for C/C++ code so we'll be ignoring it.s

  //Problem 1.3 Functional Solution
  def isPermutationFunctional(str1: String, str2: String) = {
    str1.toCharArray.sorted.sameElements(str2.toCharArray.sorted)
  }

  //Problem 1.3 Imperative Solution
  def isPermutation(str1: String, str2: String) = {
    val sortedStr1 = str1.sorted
    val sortedStr2 = str2.sorted
    sortedStr1 == sortedStr2
  }

  //Problem 1.4 is weird to write out but pretty easy to explain. Skipping it.

  //Problem 1.5
  def compressString(str: String) = {
    var retStr = ""
    if (str.length > 0) {
      var i = 1
      var count = 1
      var last = str(0)
      while(i <= str.length) {
        if (i < str.length && str(i) == last) {
          count += 1
        }
        else {
          retStr += last + count.toString
          if (i < str.length) {
            last = str(i)
            count = 1
          }
        }
        i += 1
      }
    }
    if (retStr.length < str.length) retStr
    else str
  }
}