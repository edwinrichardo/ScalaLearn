class Adder(amount: Int){
  def add(in: Int) = in + amount
}

case class Counter(val count: Int = 0) {
  def inc: Counter = copy(count = count + 1)
  def dec: Counter = copy(count = count - 1)
  def inc(amount: Int = 1): Counter = new Counter(count + amount)
  def dec(amount: Int = 1): Counter = new Counter(count - amount)
  def adjust(adder: Adder) = new Counter( adder.add(count) )
}

new Counter(10).inc.dec.inc.inc.count
new Counter(10).inc(5).dec(10).dec.count
new Counter(10).adjust(new Adder(5)).count

//Extra functionality we got for free
Counter(0)
Counter().inc
Counter().inc.dec == Counter().dec.inc
