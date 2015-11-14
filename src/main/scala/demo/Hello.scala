package demo

class Hello {
  def sayHello(name: String) = s"Hello $name"

  def +(name: String) =  "Hello " concat name

  def to(name: String): String =  "Hello " + name
}
