package demo

import org.scalatest.FunSuite

class HelloTest extends FunSuite {
  test("sayHello method works") {
    val hello = new Hello
    assert(hello.sayHello("Bunny") == "Hello Bunny")
  }

  test("+ method works") {
    val hello = new Hello
    assert(hello + "Bunny" equals "Hello Bunny")
  }

  test("to method works") {
    val hello = new Hello
    assert((hello to "Bunny") == "Hello Bunny")
  }
}
