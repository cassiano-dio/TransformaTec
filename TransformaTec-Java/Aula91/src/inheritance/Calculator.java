package inheritance;

interface Sum{

    public void sumNumbers(Double a, Double b);

}

interface Sub{

    public void subNumbers(Double a, Double b);

}

interface Calculable extends Sum, Sub{

    public void calculate();

}


public class Calculator implements Calculable{

    @Override
    public void sumNumbers(Double a, Double b) {
        System.out.println(a + b);
    }

    @Override
    public void subNumbers(Double a, Double b) {
        System.out.println(a - b);
        
    }

    @Override
    public void calculate() {
        System.out.println("Calculadora");
        
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.calculate();
        calculator.sumNumbers(2.2,2.2);
        calculator.subNumbers(2.2,2.2);
        

    }

    
    
}
