package MapPrograms

/* 2. Write a program to create map with Roll No and FirstName. Print all student information with same FirstName. */

object prog2 {
  def main(args: Array[String]): Unit = {
    val map = Map(1 -> "Vaibhav", 2 -> "Sanket", 3 -> "Sanket", 4 -> "Vaibhav", 5 -> "Rohit")
    for ((k1, v1) <- map) {
      for ((k2, v2) <- map) {
        if (v1 == v2 & k1 != k2) {
          println("Roll No: " + k1 + " FirstName: " + v1)
        }
      }
    }
  }
}
