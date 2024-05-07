package Q2

object thisYear_sec2_q1 {
  def iden(x:Int,l:List[Int => Int],ans:Int => Int,best:Int):Int =>Int ={
    if(l.isEmpty){
      return ans
    }
    val f=l.head
    val result = f(x)
    if(result<best){
      iden(x,l.tail,f,result)
    }
    else{
      iden(x,l.tail,ans,best)
    }

  }
  def identifyMin(x:Int)(l:List[Int => Int]):Int => Int ={
    return iden(x,l,(a)=>999999,999999)
  }

  def f1(a:Int):Int = a*a + 4*a - 20
  def f2(a:Int):Int = a*a + 2*a -1
  def f3(a:Int):Int = a*a + a +  10

  def test01(): Unit = {
    var score = 0;
    val l:List[Int => Int] = List(f1,f2,f3)
    if(identifyMin(3)(l)(3) == 1) score += 2;
    if(identifyMin(5)(l)(5) == 25) score += 2;
    if(identifyMin(8)(l)(8) == 76) score += 2;
    if(identifyMin(10)(l)(10) == 119) score += 2;
    if(identifyMin(12)(l)(12) == 166) score += 2;

    println("Score = " + score)

  }

  def main(args: Array[String]): Unit = {
    test01();
  }
}
