package biandratti

import cats.Order
import cats.implicits._
import cats.effect._
import cats.effect.std.PQueue

object MyQueue {

  implicit val orderForInt: Order[Int] = Order.fromLessThan((x, y) => x < y)

  def sort(list: List[Int]): IO[List[Int]] = for {
    pq <- PQueue.bounded[IO, Int](list.size)
    _ <- list.traverse(pq.offer)
    l <- List.fill(list.length)(()).traverse(_ => pq.take)
  } yield l
}
