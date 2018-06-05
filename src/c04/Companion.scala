package c04

object Companion {
  def main(args: Array[String]): Unit = {
    val person1Instance = PersonSingleton.getInstance()
    println(person1Instance)
    println(person1Instance.firstName)
  }

}

