//A traffic light is red, green, or yellow. Translate this description into
// Scala code.


//Polymorphism
sealed trait TrafficLight {
  def next: TrafficLight
}

case object Red extends TrafficLight {
  def next: TrafficLight = Green
}
case object Yellow extends TrafficLight{
  def next: TrafficLight = Red
}
case object Green extends TrafficLight {
  def next: TrafficLight = Yellow
}

// Pattern matching
sealed trait TrafficLight2{
  def next: TrafficLight2 = this match {
    case Red2 => Green2
    case Green2 => Yellow2
    case Yellow2 => Red2
  }
}
case object Red2 extends TrafficLight2
case object Green2 extends TrafficLight2
case object Yellow2 extends TrafficLight2

print(Red2.next)

//A calcula􏰀on may succeed (with an Int result) or
// fail (with a String message). Implement this.

sealed trait Calculation

final case class Success(result: Int) extends Calculation
final case class Failure(reason: String) extends Calculation


object Calculator{
  def +(calc: Calculation, operand: Int): Calculation = calc match {
    case Success(result) => Success(result + operand)
    case Failure(reason) => Failure(reason)
  }
  def -(calc: Calculation, operand: Int): Calculation = calc match {
    case Success(result) => Success(result - operand)
    case Failure(reason) => Failure(reason)
  }
  def /(calc: Calculation, operand: Int): Calculation = calc match{
    case Success(result) => operand match {
      case 0 => Failure("Division by 0")
      case _ => Success(result/ operand)
    }
    case Failure(reason) => Failure(reason)
  }
}

//Boi􏰁led water has a size (an Int), a source (which is a well, spring, or tap),
// and a Boolean carbonated. Implement this in Scala.
//Similar to enumeration
sealed trait Source
case object Well extends Source
case object Spring extends Source
case object Tap extends Source


final case class BottledWater(size: Int, source: Source, carbonated: Boolean)
