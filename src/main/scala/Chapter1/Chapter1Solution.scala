package Chapter1

class Chapter1Solution {

  def isUniqueCharFunctional(str: String) = {
    str.distinct == str
  }

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

}