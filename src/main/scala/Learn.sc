
class Person(val firsName: String, val lastName: String){
  def fullName: String = {
    return firsName + " " + lastName
  }
}

object Person{
  def apply(fullName: String) = new Person(fullName.split(" ")(0),
    fullName.split(" ")(1))
}

//With case class
case class Director(
                val firstName: String,
                val lastName: String,
                val yearOfBirth: Int) {
  def name: String =  s"$firstName $lastName"
}

object Director {
  def older(director1: Director, director2: Director): Director =
    if (director1.yearOfBirth < director2.yearOfBirth) director1 else
      director2
}

case class Film(name: String, yearOfRelease: Int,
            imdbRating: Double, director: Director) {
  def directorsAge =
    director.yearOfBirth - yearOfRelease
  def isDirectedBy(director: Director) =
    this.director == director
}

object Film {
  def newer(film1: Film, film2: Film): Film =
    if (film1.yearOfRelease < film2.yearOfRelease) film1 else film2
  def highestRating(film1: Film, film2: Film): Double = {
    val rating1 = film1.imdbRating
    val rating2 = film2.imdbRating
    if (rating1 > rating2) rating1 else rating2
  }
  def oldestDirectorAtTheTime(film1: Film, film2: Film): Director =
    if (film1.directorsAge > film2.directorsAge) film1.director
    else film2.director

}

object Dad{
  def rate(film: Film): Double = {
    film.director match {
      case Director("Clint", "Eastwood", _) => 10.0
      case Director("John", "McTierman", _) => 7.0
      case Director(_, _, _) => 3.0
    }
  }
}












