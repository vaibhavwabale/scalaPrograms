package MapPrograms

/* 1. Write a user defined functions to convert lowercase letter to uppercase and call the function using Map */

object prog1 {
  def main(args: Array[String]): Unit = {
    println("Enter the letter")
    val n = scala.io.StdIn.readLine()
    convert(n)
  }
  private def convert(n: String): Unit = {
    val cap = n.map(c => c.toUpper)
    println(cap)
  }
}
