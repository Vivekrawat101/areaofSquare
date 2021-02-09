class calculate{ // object class
    public int side;
    
    public calculate(int side){ // parameter initialised to side of the square
        this.side = side;
    }
    
   public  void areaOfSquare(){
       System.out.println("area of square = " + this.side * this.side);  // area is calculated and printed to the console 
   }
}


public class area{ // main class
  public static void main(String args[]){
   calculate B = new calculate(5);// object B of type calculate class is being initialized and perameter is passed 

   B.areaOfSquare();// function to calculate area of square is called using object B of type calculate class

  }
}