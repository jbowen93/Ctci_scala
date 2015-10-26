package Chapter2

import org.scalatest.FunSuite

class Chapter2SolutionTest extends FunSuite {

  val testObject = new Chapter2Solution

  test("testRemoveDuplicates") {
    val nodeList1 = Array(1, 2, 3, 4, 5, 1, 2)
    val nodeList2 = Array(1, 2, 3, 4, 5)
    val head = testObject.createNodeList(nodeList1)
    val nonDupHead = testObject.createNodeList(nodeList2)
    assert(testObject.removeDuplicates(head) === nonDupHead)
  }

  test("testKthToLast") {
    val nodeList1 = Array(1, 2, 3, 4, 5, 1 , 2)
    val head = testObject.createNodeList(nodeList1)
    assert(testObject.kthToLast(head, 3) === 5)
  }

  test("deleteNode") {
    val nodeList1 = Array(1, 2, 3, 4, 5)
    val head1 = testObject.createNodeList(nodeList1)
    val next1 = head1.next
    val nodeList2 = Array(1, 3, 4, 5)
    val head2 = testObject.createNodeList(nodeList2)
    testObject.deleteNode(next1)
    assert(head1 === head2 )
  }

  test("partition") {
    val nodeList1 = Array(1, 2, 3, 4, 5, 1 , 2, 2, 2)
    val checkList = Array(1, 2, 1, 2, 2, 2, 3, 4, 5)
    val head = testObject.createNodeList(nodeList1)
    val checkHead = testObject.createNodeList(checkList)
    val partitionedList = testObject.partition(head, 3)
    assert(partitionedList === checkHead)
  }

  //hiding todo to push because I'm terrible
  //test("findBeginning")

  test("isPalindrome") {
    val nodeList1 = Array(1, 2, 3, 4, 3, 2, 1)
    val head = testObject.createNodeList(nodeList1)
    assert(testObject.isPalindrome(head) === true)
  }

}
