package ClassesObjects

/* 6. Define a class Sports (id, name, description, amount). Derive two classes Indoor and Outdoor. Define appropriate constructors and operations. Create an object and perform operations. */

class Sports(val Id: Int, val name: String, val description: String, val amount: Double) {
  def Display(): Unit = {
    println("ID : " + Id + " Name : " + name + " Description : " + description + " Amount : " + amount)
  }
}

class Indoor(Id: Int, name: String, description: String, amount: Double, location: String)
  extends Sports(Id, name, description, amount) {
  override def Display(): Unit = {
    println("ID : " + Id + " Name : " + name + " Description : " + description + " Amount : " + amount + " Location : " + location)
  }
}

class Outdoor(Id: Int, name: String, description: String, amount: Double, area: Double)
  extends Sports(Id, name, description, amount) {
  override def Display(): Unit = {
    println("ID : " + Id + " Name : " + name + " Description : " + description + " Amount : " + amount + " Area : " + area)
  }
}

object prog6 {
  def main(args: Array[String]): Unit = {

    val indoorSport = new Indoor(1,"Basketball","team sport",10000,"indoor stadium")
    indoorSport.Display()

    val outdoorSport = new Outdoor(2, "Soccer", "team sport", 20000, 10)
    outdoorSport.Display()

  }
}
