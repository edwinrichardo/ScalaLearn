
trait Shape {
  def sides: Int
  def perimeter: Int
  def area: Int
}

case class Circle extends Shape{
  val sides = 0

  override def perimeter: Int = {

  }

}