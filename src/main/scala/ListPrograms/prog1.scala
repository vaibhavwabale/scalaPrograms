package ListPrograms

import scala.collection.mutable.ListBuffer

/* 1. Create Lists using five different methods( Lisp style , Java style, fill, range and tabulate methods) */

object prog1 {
  def main(args: Array[String]): Unit = {

    // Lisp-style
    val list1 = List(1,2,3,4,5)
    println("Lisp-style : " + list1)

    // Java style
    val list2 = new ListBuffer[Int] // Mutable
    list2 += 1
    list2 += 2
    list2 += 3
    list2 += 4
    list2 += 5
    val list2a = list2.toList  // Immutable
    println("Java style : " + list2a)

    // Fill method
    val list3 = List.fill(5)(2)
    println("Fill method : " + list3)

    // Range method
    val list4 = (1 to 5).toList
    println("Range method : " + list4)

    // Tabular method
    val list5 = List.tabulate(5)(n => n + 1)
    println("Tabular method : " + list5)


  }
}
