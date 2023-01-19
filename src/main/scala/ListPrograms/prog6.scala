package ListPrograms

/* 6. Write a program to create a list of 1 to 100 numbers. Create second list from first list selecting numbers multiple of 10.  */

object prog6 {
  def main(array: Array[String]): Unit = {
    val list1 = (1 to 100).toList
    val list2 = list1.filter(x => x % 10 == 0)
    println(list2)
  }
}
