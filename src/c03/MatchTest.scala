package c03

object MatchTest {
  def main(args: Array[String]): Unit = {
    var i = 10;
    i match {
      case 1 => println("in 1")
      case _ => println("invalid value")
    }

    println(i match {
      case 1 => "one"
      case 2 => "two"
      case _ => "unknown number"
    });

    var numberString = i match {
      case 1 => "one"
      case 2 => "two"
      case _ => "unknown number"
    };

    println(numberString);

    i =10000;
    var defaultValueString = i match {
      case 1 => "one"
      case 2 => "two"
      case default => "in default match"
    };

    println(defaultValueString);

    var str = "fsdfsdf"
    
    var strMatch = str match {
      case "stringmatch" => println("stringmatch")
      case _ => println("gibberish")
    }
    
    println(str match {
      case "a" | "b" | "c" => println("a b c")
      case _ => println("default")
    })
  }
    def getClassAsString(x: Any): String = x match {
      case y: Int => "is a Integer"
      case z: String => "is a String"
    }
    
    def matchWithMixedTypes(x: Any): String = x match {
      case "a" | 1 | true => "is a Integer"
      case _ => "is default"
    }
}


