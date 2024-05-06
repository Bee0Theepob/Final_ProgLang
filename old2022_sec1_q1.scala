package Q2

object old2022_sec1_q1 {
  def f1(x:Int):Boolean = {
    x%2 == 1
  }
  def f2(x:Int):Boolean = {
    x*x > 10
  }

  def tail(l:List[Int], f:Int => Boolean,T:List[Int],F:List[Int]) : List[List[Int]] = {
    if(l.isEmpty){
      return List(T,F)
    }
    else{
      if(f(l.head)){
        tail(l.tail,f,T++List(l.head),F)
      }
      else{
        tail(l.tail,f,T,F++List(l.head))
      }
    }
  }


  def partition(l:List[Int], f:Int => Boolean):List[List[Int]] = {
    return tail(l,f,List(),List())
  }

  def main(args: Array[String]): Unit = {
    val l1 = List(1,2,3,4,5)
    println(partition(l1,f1)) // List(List(1, 3, 5), List(2, 4))
    println(partition(l1,f2)) // List(List(4, 5), List(1, 2, 3))
    println(partition(l1,(x => x==0))) // List(List(), List(1, 2, 3, 4, 5))
    println(partition(l1,(x => x<6))) // List(List(1, 2, 3, 4, 5), List())
  }
}
