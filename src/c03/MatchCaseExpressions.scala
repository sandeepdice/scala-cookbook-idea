package c03

object MatchCaseExpressions {
  def echoWhatIsSent(x: Any): String = x match {
    case 0 => "got 0"
    case true => "got true"
    case "hello" => "you said hello"
    case Nil => "an empty list"

    // tuples
    case (a, b) => s"got tuple($a, $b)"
    case (a, b, c) => s"got tuple($a, $b, $c)"

    
  }

  def main(args: Array[String]): Unit = {

  }
}

