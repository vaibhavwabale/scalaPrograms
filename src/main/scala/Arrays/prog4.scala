package Arrays

/* 4. Write a program to check if the matrix is upper triangular or not. */
object prog4 {
  def main(args:Array[String]): Unit = {
    val array = Array.ofDim[Int](100, 100)
    println("Enter number of rows : ")
    val r = scala.io.StdIn.readInt()
    println("Enter number of columns : ")
    val c = scala.io.StdIn.readInt()

    println("Enter values of matrix : ")
    for(i <- 0 until r) {
      for (j <- 0 until c) {
        array(i)(j) = scala.io.StdIn.readInt()
      }
    }

    println("The given matrix is : ")
    for (i <- 0 until  r) {
      for (j <- 0 until c) {
        print(array(i)(j) + "\t")
      }
      println("\n")
    }

    var isUpper = 1
    for (i <- 0 until r) {
      for (j <- 0 until c) {
        if(j < i && array(i)(j) != 0) {
          isUpper = 0
        }
      }
    }

    if(isUpper == 1)
      println("This is a Upper triangular matrix")
    else
      println("This is not a upper triangular matrix")

  }
}
