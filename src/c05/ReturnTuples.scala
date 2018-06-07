object ReturnTuples {
  def main(args: Array[String]): Unit = {
//    need not include () when calling no-arg method
    var (myStr, myInt) = method1
    println(s"mystr: $myStr, myInt: $myInt")

    var result = method1
    println(s"mystr: ${result._1}, myInt: ${result._2}")
  }

  def method1() : (String, Int) = {
    return ("String1",1)
  }
}

