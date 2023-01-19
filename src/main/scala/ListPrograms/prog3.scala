package ListPrograms

/* 3. Create a list of integers divisible by 3 from List containing numbers from 1 to 50. */

object prog3 {
  def main(args: Array[String]): Unit = {
    val num = (1 to 50).toList
    val div3 = num.filter(x => x % 3 == 0)
    println(div3)
  }
}
