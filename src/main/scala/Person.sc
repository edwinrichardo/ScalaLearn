
case class Person(firstName: String, lastName: String) {
  def name: String = firstName + " " + lastName
}

val dave = new Person("Dave", "Gurnell")

Person

dave.firstName

new Person("Noel", "Welsh").equals(new Person("Noel", "Welsh"))

dave.copy()

dave.copy(firstName = "Dave2")

dave eq dave.copy(firstName = "Dave2")

