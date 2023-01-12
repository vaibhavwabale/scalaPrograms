package controlStructures

/* 5. Write a program to calculate sum of prime numbers between 1 to 100 */

object prog5 {
  def main(array: Array[String]): Unit = {

    var prime = 0

    for (i <- 2 to 100) {
      var sum = 0
      for (j <- 2 to i) {
        if (i % j == 0) {
          sum = sum + i
        }
      }

      if (sum == i) {
        prime = prime + i
      }
    }
    println("\nSum of Prime Between 1 to 100 is " + prime)

  }
}
