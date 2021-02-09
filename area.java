class calculate{
    public int side;
    
    public calculate(int side){
        this.side = side;
    }
    
   public  void areaOfSquare(){
       System.out.println("area of square = " + this.side * this.side);
   }
}


public class area{
  public static void main(String args[]){
   calculate B = new calculate(5);
   B.areaOfSquare();

  }
}