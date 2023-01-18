package String

/* 2. Write a program to read a character from user and
      count the number of occurrences of that character. */
object prog2 {
  def main(args: Array[String]): Unit = {

    println("Enter a String : ")
    val n = scala.io.StdIn.readLine()

    println("Enter a Character : ")
    val ch = scala.io.StdIn.readChar()

    val count = n.count(_ == ch)
    println("String is : " + n)
    println("Number of occurrences of " + ch + " is " + count)

  }
}
