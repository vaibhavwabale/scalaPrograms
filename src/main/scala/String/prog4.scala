package String

/* 4. Create array of strings and read a string from user. Display all the
      elements of array containing given string. */

object prog4 {
  def main(array: Array[String]): Unit = {

    val array = Array("sanket", "shubham", "sujot", "siddesh")

    println("Enter a String : ")
    val str = scala.io.StdIn.readLine()

    val result = array.filter(c => c.contains(str))

    if (result.isEmpty) {
      println("No elements found containing the given string.")
    } else {
      println("Elements containing the given string : ")
      result.foreach(println)
    }


  }
}
