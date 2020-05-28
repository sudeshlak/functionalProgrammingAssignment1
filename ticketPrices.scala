
import scala.io.StdIn.readLine
object ticketPrices{
   def main(args:Array[String]){
//     print("sudesh")
     def readIntN(s:String)={  printf("%s",s);
                              scala.io.StdIn.readInt()
    }
      
      def noOfAttendees(ticketPrice:Int):Int=120+(15-ticketPrice) / 5 * 20;
      def cost(ticketPrice:Int):Double=500.0+3*noOfAttendees(ticketPrice);
      def revenue(ticketPrice:Int):Double=ticketPrice*noOfAttendees(ticketPrice);
      def profit(ticketPrice:Int):Double=revenue(ticketPrice)-cost(ticketPrice);
      
       while( true ){
         
         var ticketPrice=readIntN("\nEnter the ticket price :");
         
           printf("noOfAttendees %d\n",noOfAttendees(ticketPrice));
           printf("cost %f\n",cost(ticketPrice));
           printf("revenue %f\n",revenue(ticketPrice));
           printf("profit %f\n",profit(ticketPrice));
        
      }
      
      
      
      
     
     
     
   }
  
}