package Arrays

/* 2. Write a program to calculate transpose of a matrix. */
object prog2 {
  def main(args: Array[String]): Unit = {
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

    println("Transpose Matrix")
    for (i <- 0 until 2) {
      for (j <- 0 until 2) {
        print(array(j)(i) + "\t")
      }
      println()
    }

  }
}
