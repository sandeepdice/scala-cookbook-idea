trait A01 {
  var absField : String
  var concField = 10

  def methodA(str1 : String )
}

class concA extends A01 {
  override var absField: String = "overridden in A"

  override def methodA(str1: String): Unit = ???
}

class concB(var constParam1 : String) extends A01 {
  override var absField: String = "overridden in B"

  override def methodA(str1: String): Unit = ???
}