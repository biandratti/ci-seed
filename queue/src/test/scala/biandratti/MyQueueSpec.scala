package biandratti

import cats.effect.unsafe.implicits.global

class MyQueueSpec extends munit.FunSuite {

  test("sort") {
    MyQueue
      .sort(List(1, 4, 3, 7, 5, 2, 6, 9, 8))
      .map(result => {
        assertEquals(result.headOption, Some(1))
        assertEquals(result.lastOption, Some(9))
      })
      .unsafeRunSync()
  }

}
