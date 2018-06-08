object CashRegister {
  def open = println("Opened")
  def close = print("Closed")
}

object TestSingleton extends App {

    CashRegister.close
    CashRegister.open

}
