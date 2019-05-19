

class Cat(val name: String, val colour: String, val food: String)

val oswald = new Cat("Oswald", "Black", "Milk")

val henderson = new Cat("Henderson", "Ginger", "Chips")

object ChipShop {
  def willServe(cat: Cat) : Boolean = cat.food eq "Chips"
}

ChipShop.willServe(oswald)
