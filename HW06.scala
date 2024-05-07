package Q2

object HW6 {
  def isLessThan3(x:Int) = x<3

  def tailFilter(f:Int => Boolean,l:List[Int],ans:List[Int]):List[Int] = {
    if(l.isEmpty){
      return ans
    }
    else{
      if(f(l.head)){
        return tailFilter(f,l.tail,ans++List(l.head))
      }
      else{
        return tailFilter(f,l.tail,ans)
      }
    }
  }

  def myFilter(f:Int => Boolean) (list:List[Int]) :List[Int] = {
//    if(list.isEmpty){
//      return List()
//    }
//    else{
//      if(f(list.head)){
//        return List(list.head)++myFilter(f)(list.tail)
//      }
//      else{
//        return myFilter(f)(list.tail)
//      }
//    }
    return tailFilter(f,list,List())
  }

  def main(args: Array[String]): Unit = {
    println(myFilter(x => x%2==0)(List(1,2,3,4,5)))
    print(myFilter(isLessThan3)(List(1,2,3,4,5)))
  }

}
