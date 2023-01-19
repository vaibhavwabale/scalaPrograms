package ListPrograms

/* 7. Create a list of 50 members using function 2n+3. Create second list excluding all elements multiple of 7. */

object prog7 {
  def main(array: Array[String]): Unit = {
    val list1 = (0 to 49).map(n => 2 * n + 3)
    val list2 = list1.filter(x => x % 7 != 0)
    println(list2)

  }
}
