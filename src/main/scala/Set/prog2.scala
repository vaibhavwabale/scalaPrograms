package Set

/* 2. Write a program to display largest and smallest element of the Set */

object prog2 {
  def main(args: Array[String]): Unit = {
    val set = scala.collection.mutable.Set[Int]()
    var num = 0
    println("How many element are in Set : ")
    val n = scala.io.StdIn.readInt()
    println("Enter the element of Set : ")
    for(_ <- 0 until n)
      {
        num = scala.io.StdIn.readInt()
        set += num
      }
      println("The Set is as follows: " + set)
      println("Largest from Set : " + set.max)
      println("Smallest from Set : " + set.min)
  }
}
