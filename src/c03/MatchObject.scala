package c03

object MatchObject {
  
  def main(args: Array[String]): Unit = {
    
  }
  def executeCommand(com: Command): Unit = {
    com match {
      case Start => "received start"
      case Stop => "received stop"
    }
  }
}

trait Command

case object Start extends Command
case object Stop extends Command