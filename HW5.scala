package Q2

object HW5 {
  def devide(l1: List[Int], l2: List[Int]): List[List[Int]] = {
    if (l1.length < l2.length) {
      return devide(l1 ++ List(l2.head), l2.tail)
    }
    else{
      return List(l1, l2)
    }
  }

  def merge(l1: List[Int], l2: List[Int]): List[Int] = {
    if (l1.isEmpty){
      return l2
    }
    else if (l2.isEmpty) {
      return l1
    }
    else if (l1.head < l2.head){
      return List(l1.head) ++ merge(l1.tail, l2)
    }
    else{
      return List(l2.head) ++ merge(l1, l2.tail)
    }
  }

  def mergesort(l: List[Int]): List[Int] = {
    if (l.length <= 1) l
    else {
      var a = devide(List(), l)
      var b = mergesort(a.head)
      var c = mergesort(a.tail.head)
      return merge(b, c)
    }
  }

  def main(args: Array[String]): Unit = {
    println(mergesort(List(5,7,8,9,5,4,1,2,5,87,4,6,69,6,9,69,6,9,6,112)))
  }
}
