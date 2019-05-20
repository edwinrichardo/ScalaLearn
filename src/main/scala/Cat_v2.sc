
trait Feline {
  def colour: String
  def sound: String
}

case class Cat (colour: String, food: String) extends Feline {
  val sound: String = "meow"
}

case class Lion (colour: String, maneSize: Int) extends Feline {
  val sound: String = "roar"
}

Lion("Yellow", 10).sound
Cat("Black", "Fish").sound