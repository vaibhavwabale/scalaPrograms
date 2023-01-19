package ClassesObjects

/* 4. Create abstract class Shape with abstract functions volume() and display(). Extend two classes Cube and Cylinder from it. Calculate volume of each and display it. */

abstract class Shape {
  def Volume(): Double
  def Display(): Unit

}

class Cube(val side: Double) extends Shape {
  override def Volume(): Double = side * side * side
  override def Display(): Unit = println("Cube with side length " + side)
}

class Cylinder(val radius: Double, val height: Double) extends Shape {
  override def Volume(): Double = math.Pi * radius * radius * height

  override def Display(): Unit = println("Cylinder with radius " + radius + " and height " + height)
}

object prog4 {
  def main(array: Array[String]): Unit = {

    val cube = new Cube(3)
    val cylinder = new Cylinder(2,5)

    println("Cube Volume is " + cube.Volume())
    println("Cylinder Volume is " + cylinder.Volume())

    cube.Display()
    cylinder.Display()

  }
}
