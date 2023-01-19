package ClassesObjects

/* 1. Define a class CurrentAccount (accNo, name, balance, minBalance). Define appropriate constructors and operations withdraw(), deposit(), viewBalance(). Create an object and perform operations. */

class CurrentAccount(n: Int, name: String, Balance: Float, minBal: Float) {
  private var balance = Balance
  private val minBalance = minBal
  private val accNo = n
  private val accName = name

  def Withdraw(): Unit = {
    println("Enter the amount to be withdraw : ")
    val amt = scala.io.StdIn.readFloat()
    if ((balance - amt) >= minBalance) {
      println("Balance withdraw successfully")
      balance = balance - amt
    } else {
      println("You can only withdraw amount greater than minBalance i.e.." + minBalance)
    }
  }

  def Deposit(): Unit = {
    println("Balance before deposit : " + balance)
    println("Enter the amount to deposit : ")
    val amt = scala.io.StdIn.readFloat()
    balance = balance + amt
    println("Balance after deposit : " + balance)
  }

  def viewBalance(): Unit = {
    println("Account Number : " + accNo)
    println("Name : " + accName)
    println("Account Balance : " + balance)
  }


}

object prog1 {
  def main(args: Array[String]): Unit = {
    println("Create new account for customer : ")
    println("Enter the account number : ")
    val n = scala.io.StdIn.readInt()
    println("Enter the account holder name : ")
    val name = scala.io.StdIn.readLine()
    println("Enter the account balance : ")
    val Balance = scala.io.StdIn.readFloat()
    println("Enter the account minimum balance : ")
    val minBal = scala.io.StdIn.readFloat()

    val curr = new CurrentAccount(n, name, Balance, minBal)
    var option = 0
    do {
      println("Enter the operation you want to perform : ")
      println("1. Withdraw")
      println("2. Deposit")
      println("3. viewBalance")
      println("4. Exit")
      option = scala.io.StdIn.readInt()
      option match {
        case 1 => curr.Withdraw()
        case 2 => curr.Deposit()
        case 3 => curr.viewBalance()
        case 4 => println("Exiting...")
        case _ => println("Invalid choice entered, Try again...")
      }
    } while (option != 4)


  }
}
