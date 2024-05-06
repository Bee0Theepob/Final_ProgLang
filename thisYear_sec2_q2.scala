package Q2

object thisYear_sec2_q2 {

  def exist(x:Any,l:List[Any]) : Boolean = {
    if(l.isEmpty){
      return false
    }
    if(l.head == x){
      return true
    }
    return exist(x,l.tail)
  }

  def tailDiff(l1: List[Any], l2: List[Any],ans:List[Any]):List[Any] = {
    if (l1.isEmpty) {
      return ans
    }
    else {
      if (!exist(l1.head, l2)) {
        return tailDiff(l1.tail, l2, ans ++ List(l1.head))
      }
      else {
        return tailDiff(l1.tail, l2, ans)
      }
    }
  }

  def difference(l1: List[Any], l2: List[Any]): List[Any] = {
  return tailDiff(l1,l2,List())



  }

  def test01(): Unit = {
    var score = 0;
    val l1 = List(6, 2, 4, 3, 1, 7)
    val l2 = List(10, 2, 6, 3, 8, 4)
    val l3 = List("a", "b", "c")
    val l4 = List("c", "d", "b", "e")

    if (difference(List(), l2) == List()) score += 1;
    if (difference(l1, List()) == List(6, 2, 4, 3, 1, 7)) score += 1;
    if (difference(l1, l2) == List(1, 7)) score += 2
    if (difference(l3, l4) == List("a")) score += 2
    if (difference(l2, l1) == List(10, 8)) score += 2
    if (difference(l4, l3) == List("d", "e")) score += 2

    println("Score = " + score)

  }

  def main(args: Array[String]): Unit = {
    test01();
  }

}
