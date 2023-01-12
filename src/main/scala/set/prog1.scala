package set

/* 1. Write a program to create two sets and find common elements between them.  */

object prog1 {
  def main(args: Array[String]): Unit = {

    val set1 = scala.collection.mutable.Set[Int]()
    var n1 = 0
    val set2 = scala.collection.mutable.Set[Int]()
    var n2 = 0

    println("How many element are in Set 1 : ")
    val num1 = scala.io.StdIn.readInt()
    println("Enter the element of Set 1 : ")
    for (_ <- 0 until num1) {
      n1 = scala.io.StdIn.readInt()
      set1 += n1
    }

    println("How many element are in Set 2 : ")
    val num2 = scala.io.StdIn.readInt()
    println("Enter the element of Set 2 : ")
    for (_ <- 0 until num2) {
      n2 = scala.io.StdIn.readInt()
      set2 += n2
    }

    println("Common Value is " + set1.&(set2))
//    println("Common Value is " + set1.intersect(set2))
  }
}
