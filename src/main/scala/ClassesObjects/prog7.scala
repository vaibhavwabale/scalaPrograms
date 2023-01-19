package ClassesObjects

/* 7. Design abstract class Employee with computeSal() as abstract function. Create two subclasses Worker and Manager. Salary of worker should be calculated on hourly basis of work and Salary of Manager should be calculated on monthly basis with additional incentives. */

abstract class Employees {
  def computeSal(): Double
}

class Worker extends Employees {
  private var hoursWorked: Double = 0.0
  private var hourlyWage: Double = 0.0

  def setHoursWorked(hours: Double): Unit = {
    hoursWorked = hours
  }

  def setHourlyWage(wage: Double): Unit = {
    hourlyWage = wage
  }

  override def computeSal(): Double = {
    hoursWorked * hourlyWage
  }

}

class Manager extends Employees {

  private var monthlySalary: Double = 0.0
  private var incentives: Double = 0.0

  def setMonthlySalary(salary: Double): Unit = {
    monthlySalary = salary
  }

  def setIncentives(inc: Double): Unit = {
    incentives = inc
  }

  override def computeSal(): Double = {
    monthlySalary + incentives
  }

}


object prog7 {
  def main(args: Array[String]): Unit = {

    val worker = new Worker
    worker.setHoursWorked(40)
    worker.setHourlyWage(15)
    val workerSalary = worker.computeSal()
    println("Worker Salary : " + workerSalary)

    val manager = new Manager
    manager.setMonthlySalary(5000)
    manager.setIncentives(1000)
    val managerSalary = manager.computeSal()
    println("Manager Salary : " + managerSalary)
  }
}
