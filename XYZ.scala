import scala.io.StdIn.readLine
object XYZ {
  

  
  def main(args:Array[String])
		{
    
    
    def normal(n:Int):Int=n*150
    def ot(ot:Int):Int=ot*75
    def income(h1:Int,h2:Int):Double=normal(h1)+ot(h2)
    def tax(income:Double):Double=income*0.1
    def takehome(t1:Int,t2:Int):Double={
                                          
                                          
                                          income(t1, t2)-tax(income(t1,t2))
    }
      
      //    println(takehome(25,30))
    
    def readIntN(s:String)={  printf("%s",s);
                              scala.io.StdIn.readInt()
    }
    var normalDays=readIntN("Enter the number of normal days :");
    var otDays=readIntN("Enter the number of OT days :");
    print("Weekly home salary :");
    print(takehome(normalDays,otDays));
    
    
    }
  

}