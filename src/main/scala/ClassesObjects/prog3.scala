package ClassesObjects

/* 3. Create abstract class Order (id, description). Derive two classes PurchaseOrder&amp; SalesOrder with members Vendor and Customer. Create object of each PurchaseOrder and SalesOrder. Display the details of each account. */

abstract class Order(val id: Int, val description: String)

class PurchaseOrder(id: Int, description: String, val vendor: String) extends Order(id, description)
class SalesOrder(id: Int, description: String, val customer: String) extends Order(id, description)


object prog3 {
  def main(args: Array[String]): Unit = {

    val purchaseOrder = new PurchaseOrder(1,"Stationary","ABC Inc.")
    val salesOrder = new SalesOrder(2,"Electronics","John Doe")

    println(purchaseOrder.id + " " + purchaseOrder.description + " " + purchaseOrder.vendor)
    println(salesOrder.id + " " + salesOrder.description + " " + salesOrder.customer)


  }
}
