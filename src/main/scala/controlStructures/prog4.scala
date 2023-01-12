package controlStructures

object prog4 {
  def main(args: Array[String]): Unit = {
    val arr = Array(20, 100, 80, 50)
    var temp = 0
    for(i <- arr.indices)
      {
        for(j <- i + 1 until arr.length) {
          if(arr(i) < arr(j)) {
            temp = arr(j)
            arr(j) = arr(i)
            arr(i) = temp
          }
        }
      }
      println("Second Highest Number is " + arr(1))

  }
}
