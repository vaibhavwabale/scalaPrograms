package String

/* 1. Write a program to count uppercase letters in a string and
      convert it to lowercase and display the new string */

object prog1 {
  def main(args: Array[String]): Unit = {

    println("Enter the String : ")
    val n = scala.io.StdIn.readLine()
    var count = 0

    val lower = n.map { c =>
      if (c.isUpper) count = count + 1
      c.toLower
    }

    println("Uppercase Letters: " + count)
    println("Original String : " + n)
    println("String in lowercase : " + lower)

  }

}
