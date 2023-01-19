package ClassesObjects

/* 2. Define a class Employee (id, name, salary). Define methods accept() and display(). Display details of employee having maximum salary. */

class Employee(var Id: Int, var name: String, var salary: Double) {

  def Accept(): Unit = {
    println("Enter Employee ID : ")
    Id = scala.io.StdIn.readInt()
    println("Enter Employee Name : ")
    name = scala.io.StdIn.readLine()
    println("Enter Employee Salary : ")
    salary = scala.io.StdIn.readDouble()
  }

  def display(): Unit = {
    println("Employee ID : " + Id)
    println("Employee Name : " + name)
    println("Employee Salary : " + salary)
  }

}

object prog2 {
  def main(array: Array[String]): Unit = {

    val n = scala.io.StdIn.readInt()
    var employees = List[Employee]()
    for (_ <- 1 to n) {
      val emp = new Employee(0, "", 0)
      emp.Accept()
      employees = employees :+ emp
    }

    var maxSalary = Double.MinValue
    var maxEmployee: Employee = null
    for (employee <- employees) {
      if (employee.salary > maxSalary) {
        maxSalary = employee.salary
        maxEmployee = employee
      }
    }

    if (maxEmployee != null) {
      println("Employee with maximum salary : ")
      maxEmployee.display()
    } else {
      println("No employee found.")
    }


  }
}
