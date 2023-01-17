package Arrays

/* 3. Write a program to calculate determinant of a matrix */

object prog3 {
  def main(args: Array[String]): Unit = {
    var determinant = 0
    val array = Array.ofDim[Int](2, 2)
    array(0)(0) = 1
    array(0)(1) = 2
    array(1)(0) = 3
    array(1)(1) = 4

    println("Matrix")
    for (i <- 0 until 2) {
      for (j <- 0 until 2) {
        print(array(i)(j) + "\t")
      }
      println()
    }

    determinant = array(0)(0) * array(1)(1) - array(0)(1) * array(1)(0)

    println("Determinant is " + determinant)



  }
}
