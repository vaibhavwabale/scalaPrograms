package String

/* 3. Write a program to read two strings. Remove the
       occurrence of second string in first string. */
object prog3 {
  def main(args: Array[String]): Unit = {

    println("Enter String 1 : ")
    val str1 = scala.io.StdIn.readLine()

    println("Enter String 2 : ")
    val str2 = scala.io.StdIn.readLine()

    val newStr = str1.replaceAll(str2,"")
    println("New String is : " + newStr)





  }
}
