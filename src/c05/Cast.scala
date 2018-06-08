package c05

object Cast {
  def main(args: Array[String]): Unit = {
    val a = 10
    val longA = a.asInstanceOf[Long]
    val b = 100
    val floatB = b.asInstanceOf[Float]
    print(s"a $a longA $longA b $b floatB $floatB")
  }
}
