package Arrays

object prog5 {
  def main(args: Array[String]): Unit = {

    println("Enter the number of row and column : ")
    val r = scala.io.StdIn.readInt()
    val c = scala.io.StdIn.readInt()

    val array = Array.ofDim[Int](r, c)

    println("Enter the elements : ")
    for (i <- 0 until r) {
      for (j <- 0 until c) {
        array(i)(j) = scala.io.StdIn.readInt()
      }
    }

    println("Unsorted Array")
    for (i <- 0 until r) {
      for (j <- 0 until c) {
        print(array(i)(j) + "\t")
      }
      println("\n")
    }

    println("Ascending sorted matrix : ")
    var temp = 0
    for (i <- 0 until r) {
      for (j <- 0 until c) {
        if (!(i == 0 && j == 0)) {
          temp = array(i)(j)
        }
        var k = i
        var l = j
        while (k >= 0 && l >= 0 && temp < array(i)(j)) {
          array(i + 1)(j + 1) = array(i)(j)
          k = k - 1
          l = l - 1
        }
        array(i)(j) = temp
        print(array(i)(j) + "\t")
      }
      println("\n")
    }

  }
}
