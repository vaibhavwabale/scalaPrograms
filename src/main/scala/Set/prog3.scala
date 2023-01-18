package Set

/* Write a program to merge two sets and calculate product and average of all elements of the Set */

object prog3 {
  def main(args: Array[String]): Unit = {

    val set1 = scala.collection.mutable.Set[Int]()
    val set2 = scala.collection.mutable.Set[Int]()
    var n = 0

    // For Set 1
    println("How many element are in Set 1 : ")
    var num = scala.io.StdIn.readInt()
    println("Enter the elements of Set 1 : ")
    for(_ <- 0 until num)
      {
        n = scala.io.StdIn.readInt()
        set1 += n
      }

    // For Set 2
    println("How many element are in Set 2 : ")
    num = scala.io.StdIn.readInt()
    println("Enter the elements of Set 2 : ")
    for (_ <- 0 until num) {
      n = scala.io.StdIn.readInt()
      set2 += n
    }

    println("The Set1 is as follows " + set1)
    println("The Set2 is as follows " + set2)

    // Merging Two Sets
    val set3 = set1 ++ set2
    println("The Merged Set is as follows " + set3)

    // Calculating Product of All Elements
    var prod = 1
    set3.foreach(prod *= _)
    println("Product is " + prod)

    // Calculating Average of All Elements
    var avg = 0.0
    var sum = 0
    set3.foreach(sum += _)
    avg = sum / set3.size
    println("Average of Set Element is " + avg)

  }
}
