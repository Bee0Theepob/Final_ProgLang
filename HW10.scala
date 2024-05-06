package Q2

object HW10 {
  def rev(list:List[Int]):List[Int] = {
    if(list.isEmpty) list
    else rev(list.tail) ++ List(list.head)
  }
  def cal(f1: (Int,Int) => Int, f2: (Int,Int) => Int)(list:List[Int]):Int = {
    if(list.length == 1) list.head
    else if(list.length % 2 == 0) f1(cal(f1,f2)(list.tail),list.head)
    else f2(cal(f1,f2)(list.tail),list.head)
  }
  def alternate(f1: (Int,Int) => Int, f2: (Int,Int) => Int, list:List[Int]):Int ={
    if(list.isEmpty){
     return 0
    }
    else{
      cal(f1,f2)(rev(list))
    }

  }
  def +(a:Int,b:Int): Int = {
    return a+b
  }
  def -(a:Int,b:Int): Int = {
    return a-b
  }
  def main(args:Array[String]):Unit = {
    println(alternate(+,-,List()))
    println(alternate(+,-,List(55)))
    println(alternate(+,-,List(1,2)))
    println(alternate(+,-,List(1,2,3)))
    println(alternate(+,-,List(1,2,3,4)))
  }
}

