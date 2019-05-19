class Adder(amount: Int){
  def add(in: Int) = in + amount
}

class Counter(val count: Int) {
  def inc: Counter = inc()
  def dec: Counter = dec()
  def inc(amount: Int = 1): Counter = new Counter(count + amount)
  def dec(amount: Int = 1): Counter = new Counter(count - amount)
  def adjust(adder: Adder) = new Counter( adder.add(count) )
}

new Counter(10).inc.dec.inc.inc.count
new Counter(10).inc(5).dec(10).dec.count
new Counter(10).adjust(new Adder(5)).count
