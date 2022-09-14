package polymorphism;

public class Calculator {
    
   public void sum(int a){

        System.out.println( a + 0);

   }

   public void sum( int a, int b ){

    System.out.println( a + b );

   }

   public void sum( int a, int b, int c ){
    System.out.println( a + b + c );
   }

   public void sum( Double a, Double b, Double c ){

    System.err.println( a + b + c );

   }

   public static void main(String[] args) {
    
    Calculator calculator = new Calculator();
    
    calculator.sum(5);
    calculator.sum(5, 10);
    calculator.sum(5, 15, 20);
    calculator.sum(5.0, 15.0, 20.0);



   }


}
