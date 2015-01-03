
object nth {
  def nth[T] (n: Int, xs: List[T]): T =
    if (xs.isEmpty) throw new IndexOutOfBoundsException // 계속 갔는데 인덱스가 0이 안됨 또는 0이 되기전에 Nil 만남
    else if (n == 0) xs.head
    else nth(n-1,xs.tail)

  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))

  nth(2,list)
  nth(-1, list)
}

trait List[T] {
  def isEmpty : Boolean
  def head: T
  def tail: List[T]
}


class Cons[T](val head:T, val tail: List[T]) extends  List[T] {
  def isEmpty = false

}

class Nil[T] extends List[T] {
  def isEmpty = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}