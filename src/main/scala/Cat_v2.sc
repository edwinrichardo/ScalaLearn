
trait Feline {
  def colour: String
  def sound: String
}

case class Cat (colour: String, food: String) extends Feline {
  val sound = "meow"
}

case class Lion (colour: String, maneSize: Int) extends Feline {
  val sound = "roar"
}

case class Tiger(colour: String) extends Feline {
  val sound = "roar"
}

case class Panther(colour: String) extends Feline {
  val sound = "roar"
}

Lion("Yellow", 10).sound
Cat("Black", "Fish").sound

//There is duplication above
//Another alternative is to define a new trait Big Cat

trait BitCat extends Feline{
  override val sound = "roar"
}