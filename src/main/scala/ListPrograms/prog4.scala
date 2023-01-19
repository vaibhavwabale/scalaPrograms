package ListPrograms

/* 4. Create a list of even numbers up to 10 and calculate its product. */

object prog4 {
  def main(args: Array[String]): Unit = {
    val num = (1 to 10).toList
    val evenNo = num.filter(x => x % 2 == 0)
    val product = evenNo.product
    println("Product of even numbers up to 10 is " + product)
  }
}
