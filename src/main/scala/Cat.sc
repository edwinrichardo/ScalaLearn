

case class Cat(val name: String, val colour: String, val food: String)

val oswald = new Cat("Oswald", "Black", "Milk")

val henderson = new Cat("Henderson", "Ginger", "Chips")

//With pattern matching
object ChipShop {
  def willServe(cat: Cat): Boolean = {
    cat match {
      case Cat(_, _, "Chips") => true
      case Cat(_,_,_) => false
    }
  }
}

ChipShop.willServe(oswald)
