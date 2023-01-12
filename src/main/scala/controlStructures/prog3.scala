package controlStructures

/* 3. Write a program to read five random numbers and check that random numbers are perfect number or not */

object prog3 {
  def main(args: Array[String]): Unit = {
    println("How many numbers you want to calculate: ")
    val n = scala.io.StdIn.readInt()

    for (i <- 1 to n) {
      println("Enter Number: " + i + " -->")
      val n = scala.io.StdIn.readInt()
      var sum = 0
      for (i <- 1 until n - 1) {
        if (n % i == 0) {
          sum = sum + i
        }
      }
      if (sum == n) {
        println("Number is Perfect")
      } else {
        println("Number is Not Perfect")
      }

    }

  }
}
