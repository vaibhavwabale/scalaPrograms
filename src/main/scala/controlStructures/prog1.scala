package controlStructures

/* 1. Write a program to calculate average of all numbers between n1 and n2(eg.100 to 300 Read values of n1 and n2 from user) */

object prog1 {
  def main(args: Array[String]): Unit = {
    var sum = 0.0
    var avg = 0.0
    println("Enter a N1 and N2 Numbers: ")
    val n1 = scala.io.StdIn.readInt()
    val n2 = scala.io.StdIn.readInt()

    val n = n2 - n1

    for (i <- n1 to n2) {
      sum = sum + i
    }
    avg = sum / n
    println("Average of " + n1 + " to " + n2 + " is " + avg)
  }
}
