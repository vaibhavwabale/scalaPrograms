package Arrays

/* 6. Write a program for multiplication of two matrices (Validate number of rows and columns
      before multiplication and give appropriate message) */
object prog6 {
  def main(args: Array[String]): Unit = {

    println("Enter the number of rows and columns in Matrix A")
    val rA = scala.io.StdIn.readInt()
    val cA = scala.io.StdIn.readInt()
    println("Enter the number of rows and columns in Matrix B")
    val rB = scala.io.StdIn.readInt()
    val cB = scala.io.StdIn.readInt()

    if (cA != rB) {
      println("Error: the number of columns in matrix A must match the number of rows in matrix B.")
    } else {

      val arrayA = Array.ofDim[Int](rA, cA)
      val arrayB = Array.ofDim[Int](rB, cB)

      println("Enter the elements of matrix A, row by row: ")
      for (i <- 0 until rA) {
        for (j <- 0 until cA) {
          arrayA(i)(j) = scala.io.StdIn.readInt()
        }
      }

      println("Matrix A : ")
      for (i <- 0 until rA) {
        for (j <- 0 until cA) {
          print(arrayA(i)(j) + "\t")
        }
        println("\n")
      }

      println("Enter the elements of matrix B, row by row: ")
      for (i <- 0 until rB) {
        for (j <- 0 until cB) {
          arrayB(i)(j) = scala.io.StdIn.readInt()
        }
      }

      println("Matrix B : ")
      for (i <- 0 until rB) {
        for (j <- 0 until cB) {
          print(arrayB(i)(j) + "\t")
        }
        println("\n")
      }

      val result = Array.ofDim[Int](rA, cB)
      for (i <- 0 until rA) {
        for (j <- 0 until cB) {
          for (k <- 0 until cA) {
            result(i)(j) = result(i)(j) + arrayA(i)(k) * arrayB(k)(j)
          }
        }
      }

      println("Resulting Matrix : ")
      for (i <- 0 until rA) {
        for (j <- 0 until cB) {
          print(result(i)(j) + "\t")
        }
        println("\n")
      }

    }

  }
}
