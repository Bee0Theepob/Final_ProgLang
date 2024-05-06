package Q2

object HW9 {
  def f1(c:Char): Char = {
    return c.toLower
  }

  def turingStep(f:Char => Char,tape:List[Char], n:Int): List[Char] ={
    if(n==0 || tape.isEmpty){
      return tape
    }
    else{
      return List(f(tape.head))++turingStep(f,tape.tail,n-1)
    }
  }

  def main(args: Array[String]): Unit = {
    var tape = List('C','H','A','R')
    for(i <- 0 to 6){
      println(turingStep(f1,tape,i))
    }


  }


}
