package Chapter2

import scala.collection.mutable
import scala.util.control.Breaks._


class Chapter2Solution {

  //Linked List Implementations
  case class Node(var d:Int, var next:Node = null)

  def createNodeList(arr: Array[Int]) = if(arr.length > 0) {
    var head = Node(arr(0), null)
    val ret = head
    for(i <- 1 until arr.length) {
      head.next = Node(arr(i))
      head = head.next
    }
    ret
  }
  else null

  def printNodeList(src:Node) = {
    var head = src
    while(head != null) {
      print(head.d + " ")
      head = head.next
    }
    println("!")
  }

  def nodeToArray(src: Node) = {

  }

  def removeDuplicates(src: Node) = {
    var current = src
    while(current != null) {
      var runner = current
      while(runner != null && runner.next != null) {
        if(runner.next.d == current.d) {
          runner.next = runner.next.next
        }
        runner = runner.next
      }
      current = current.next
    }
    src
  }

  def kthToLast(src: Node, k:Int) = {
    var p1:Node = src
    var p2:Node = src

    //Move p2 forward k nodes
    for(i <- 0 to k-1) {
      if(p2 == null) null
      else p2 = p2.next
    }
    //When p2 hits end p1 with be at kthToLast
    while(p2 != null) {
      p1 = p1.next
      p2 = p2.next
    }
    p1.d
  }

  def deleteNode(src: Node) = {
    val next = src.next
    src.d = next.d
    src.next = next.next
  }

  def partition(src: Node, x: Int): Node = {
    val head = src

    var lessThanStart: Node = null
    var lessThanEnd: Node = null

    var greaterThanStart: Node = null
    var greaterThanEnd: Node = null

    var iterator = head

    while (iterator != null) {
      if (iterator.d < x) {
        //Make a list for less than x
        if(lessThanStart == null) {
          lessThanStart = iterator
          lessThanEnd = iterator
        }
        else {
          lessThanEnd.next = iterator
          lessThanEnd = iterator
        }

      } else {
        //Make a list for greater than x
        if(greaterThanStart == null) {
          greaterThanStart = iterator
          greaterThanEnd = iterator
        }
        else {
          greaterThanEnd.next = iterator
          greaterThanEnd = iterator

        }

      }
      iterator = iterator.next
    }
    //Merge the Lists and return head
    greaterThanEnd.next = null
    lessThanEnd.next = greaterThanStart
    lessThanStart

  }

  //Hiding todo to push because I'm terrible
  //Problem 2.5 linked list addition
  /*
  def addLists(l1: Node, l2: Node, carry: Int): Node = {
    var ret = null
    if(l1 == null && l2 == null && carry == 0 ) {
      ret = null
    }

    var result = Node(carry, null)

    //Add l1 + l2 + carry
    var value = carry
    if(l1 != null) value += l1.d
    if(l2 != null) value += l2.d

    //Get last digit
    result.d = value % 10

    //Recurse
    if (l1 != null || l2 != null ) {
      var more = addLists

    }

  }
  */

  def findBeginning(src: Node) : Node = {
    var ret: Node = src

    var slow: Node = src
    var fast: Node = src

    //Find meeting point at LOOP_SIZE - k steps into list
    while (fast != null && fast.next != null) {
      slow = slow.next //Step by 1
      fast = fast.next.next //Step by 2
      if (slow == fast) break() //Collision
    }

    //Error check if there is no loop
    if(fast == null || fast.next == null) ret = null

    //Move slow to head
    //Keep fast at collision point
    //Each are k steps away from loop start
    //Move at same pace and they will meet at loop start
    slow = src
    while (slow != fast) {
      slow = slow.next
      fast = fast.next
    }
    fast
  }

  def isPalindrome(src: Node) : Boolean = {
    var ret = true

    var fast: Node = src
    var slow: Node = src

    val stack = mutable.Stack[Int]()

    //Push elements from first half of linked list onto stack
    //When fast runner gets to end of list slow will be at middle
    while (fast != null && fast.next != null) {
      stack.push(slow.d)
      slow = slow.next //Move once
      fast = fast.next.next //Move twice
    }
    //Has odd number of elements, so skip middle
    if (fast != null) {
      slow = slow.next
    }

    while (slow != null) {
      val top = stack.pop()

      //If values are different than it's not a palindrome
      if (top != slow.d) ret = false

      slow = slow.next

    }
    ret
  }



}