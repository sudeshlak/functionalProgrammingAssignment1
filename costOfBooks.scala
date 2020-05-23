
object costOfBooks {
  
  def main(args:Array[String])
		{
			
		
   var coverPrice=24.95D;
   var discount=40D;
  
   var noOfCopies=60D;
   var costOfBooks=0D;
   var shipCostto50=3D;
   var shipCostAfter50=0.75D
    if(noOfCopies<=50){
      costOfBooks=(coverPrice*noOfCopies*(100-discount)/100)+(noOfCopies*shipCostto50);
	}else{
     costOfBooks=(coverPrice*noOfCopies*(100-discount)/100)+(50*shipCostto50)+((noOfCopies-50)*shipCostAfter50);
    } 
     println("Cost Of Books ="+costOfBooks);
    
			
		}
  
}