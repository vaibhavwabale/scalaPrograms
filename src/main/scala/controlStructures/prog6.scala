package controlStructures

/* 6. Write a program to read an integer from user and convert it to binary and octal using user defined functions. */

object prog6 {

  private def octal(n: Int): Unit = {
    printf("Octal Value is  %o\n", n)
  }

  def main(args: Array[String]): Unit = {

    println("Enter a Integer")
    val n = scala.io.StdIn.readInt()

    val binary = n.toBinaryString
    println("Binary of " + n + " is " + binary)
    octal(n)


  }
}
