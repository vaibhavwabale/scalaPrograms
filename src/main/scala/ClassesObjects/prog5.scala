package ClassesObjects

/* 5. Create class Project (id, name, location). Define parameterized constructor. Keep a count of each object created and display the details of each project. */

class Project(val id: Int, val name: String, val location: String) {
  Project.counter += 1

  def displayDetails(): Unit = {
    println("Project ID : " + id)
    println("Project Name : " + name)
    println("Project Location : " + location)
  }

}

object Project {
  private var counter = 0
  def numberOfObjects(): Int = counter
}

object prog5 {
  def main(array: Array[String]): Unit = {

    val project1 = new Project(1,"Project A","New York")
    val project2 = new Project(2,"Project B","London")
    val project3 = new Project(3,"Project C","Sydney")

    println("Number of projects created : " + Project.numberOfObjects())

    project1.displayDetails()
    project2.displayDetails()
    project3.displayDetails()

  }
}
