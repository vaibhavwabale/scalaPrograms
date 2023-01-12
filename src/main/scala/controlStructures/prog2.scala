package controlStructures

/* 2. Write a program to calculate factorial of a number */

object prog2 {
  def main(args: Array[String]): Unit = {
    var fact = 1
    println("Enter a Number")
    val n = scala.io.StdIn.readInt()

    for(i <- 1 to n) {
      fact = fact * i
    }
    println("Factorial of " + n + " is " + fact)

  }
}
