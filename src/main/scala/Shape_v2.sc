
sealed trait Shape {
  def sides: Int
  def perimeter: Double
  def area: Double
}

case class Circle(radius: Double) extends Shape{
  val sides = 2

  def perimeter: Double = 2*math.Pi*radius

  def area: Double = math.Pi*radius*radius

}

case class Square(size: Double) extends Shape {
  val sides = 4

  override def perimeter: Double = sides * size

  override def area: Double = size * size
}


object Draw{
  def apply(shape: Shape) = {
    shape match {
      case Circle(radius) => s"A circle of radius ${radius}"
      case Square(size) => s"A square of size ${size}"

    }
  }
}

Draw(Square(10))

