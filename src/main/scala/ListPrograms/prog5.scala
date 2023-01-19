package ListPrograms

/* 5. Write a program to create list with 10 members using function 3n2+4n+6 */

object prog5 {
  def main(array: Array[String]): Unit = {
    val list = (0 to 9).map(n => 3 * n * n + 4 * n + 6)
    println(list)
  }
}
