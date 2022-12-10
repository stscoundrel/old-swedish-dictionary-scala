package io.github.stscoundrel.scalatemplate

import org.scalatest.funsuite.AnyFunSuite

class AppTest extends AnyFunSuite {
  test("test cases run") {
    assert(true)
    assert(!false)
    assert(App.dummyMethod(2, 2) == 4)
  }
}