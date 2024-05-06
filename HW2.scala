package Q2

object HW2 {
  def insertInOrder(x: Int, l:List[Int]): List[Int] ={
      if(l.isEmpty){
        return l++List(x)
      }

      if(x<l.head){
        return List(x)++l
      }
    return List(l.head)++insertInOrder(x,l.tail)
  }

  def main(args: Array[String]): Unit = {
    var mylist=List(1,5,9,10,20,25,38,69,111)
    println(insertInOrder(0,mylist))
    println(insertInOrder(2,mylist))
    println(insertInOrder(30,mylist))
    println(insertInOrder(6,mylist))
    println(insertInOrder(70,mylist))
    println(insertInOrder(113,mylist))
  }

}
