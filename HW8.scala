package Q2

object HW8 {
  def maxAll(l1:List[List[Int]]) :List[Int] = {
    if(l1.isEmpty) {
      return List()
    }
    else if(l1.length == 1) {
      return l1.head
    }
    else {
      var l2 = maxAll(l1.tail)
      if(l1.head.isEmpty) {
        return l2
      }
      else if(l2.isEmpty) {
        return l1.head
      }
      else if (l1.head.head > l2.head) {
        return List(l1.head.head) ++ maxAll(List(l1.head.tail, l2.tail))
      }
      else {
        return List(l2.head) ++ maxAll(List(l1.head.tail, l2.tail))
      }
    }
  }

  def main(args:Array[String]): Unit = {
    println(maxAll(List()))
    println(maxAll(List(List())))
    println(maxAll(List(List(1,2,3,4,8,9),List(),List(4,5),List(1,2,3,5,6,10,11))))
    println(maxAll(List(List(3,4),List(1,2,3,4,51,61),List(1,2,31,41,61,51))))
    println(maxAll(List(List(1,2,3,40,5,6),List(10,2,30,4),List(1,200),List(0,0,0,0,0,0,0,0,9))))
  }

}
