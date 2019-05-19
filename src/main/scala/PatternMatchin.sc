
//expr0 match {
//  case pattern1 => expr1
//  case pattern2 => expr2
//    ...
//}
//where
//• the expression expr0 evaluates to the value we match;
//• the patterns, or guards, pattern1, pattern2, and so on are
//  checked against this value in order; and
//• the right-hand side expression (expr1, expr2, and so on) of the
//first pa􏰂ern that matches is evaluated􏰄.
//Pa􏰂ern matching is itself an expression and thus evaluates to a value—
//the value of the matched expression.

//A pa􏰂tern can be one of
//1. a name,binding any value to that name;
//2. an underscore,matching any value and ignoring it;
//3. a literal,matching the value the literal denotes;
//4. a constructor-style pa􏰂tern for a case class.


case class Person(firstName: String, lastName: String)

object Stormtrooper{
  def inspect(person: Person): String =
    person match {
      case Person("Luke", "Skywaler") => "Stop, rebel scum!"
      case Person("Han", "Solo") => "Stop, rabel scum!"
      case Person(first, last) => s"Move along, $first"
    }
}

Stormtrooper.inspect(Person("Noel", "Welsh"))
Stormtrooper.inspect(Person("Han", "Solo"))