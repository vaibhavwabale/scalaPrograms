package ListPrograms

/* 2. Create two Lists and Merge it and store the sorted in ascending order. */

object prog2 {
  def main(args: Array[String]): Unit = {
    val list1 = List(4,3,2,1)
    val list2 = List(9,10,5,6)
    val mergedList = (list1 ++ list2).sorted
    println(mergedList)
  }
}
