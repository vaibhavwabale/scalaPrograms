package Arrays

/* 1. Write a program to find maximum and minimum of an array */

object prog1 {
  def main(args: Array[String]): Unit = {

    println("How many numbers ")
    val n = scala.io.StdIn.readInt()
    val m = new Array[Int](n)
    println("Enter the Array: ")
    for (i <- 0 until n) {
      m(i) = scala.io.StdIn.readInt()
    }
    println("Array Elements are : ")
    for (i <- m.indices) {
      println("" + m(i))
    }

    var min = m(0)
    var max = m(0)

    for (i <- 1 until n) {
      if (m(i) < min)
        min = m(i)
      else if (m(i) > max)
        max = m(i)
    }

    println("Minimum is " + min + " and Maximum is " + max)


  }
}
