
trait Shape {
  def sides: Int
  def perimeter: Double
  def area: Double
}

trait Rectangular extends Shape{
  def width: Double
  def height: Double
  val sides = 4
  override val perimeter = 2*width + 2*height
  override val area = width*height
}

case class Circle(radius: Double) extends Shape{
  val sides = 2

  def perimeter: Double = 2*math.Pi*radius

  def area: Double = math.Pi*radius*radius

}

case class Square(size: Double) extends Rectangular {
  def width = size
  def height = size
}

case class Rectangle(width: Double, height: Double) extends Rectangular


Circle(7).area
Circle(7).sides

Square(3).area
Square(3).sides

Rectangle(10.5, 3).area
Rectangle(10.5, 3).sides
