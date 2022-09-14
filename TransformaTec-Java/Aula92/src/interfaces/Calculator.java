package interfaces;

interface Calculable {

    //declaração de assinatura e retorno do método
    public void calculate(int a, int b);

    public void multiply(int a, int b);

}

public class Calculator implements Calculable{

    //implementando o método da interface - dando um corpo ao método
    @Override
    public void calculate(int a, int b) {

        System.out.println( a + b);

    }

    @Override
    public void multiply(int a, int b) {

        System.out.println( a * b);
        
    }

    //método próprio da classe
    public void square(int a, int b){
        System.out.println(a^b);
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.calculate(2,4);
        calculator.square(2, 4);
        calculator.multiply(2, 4);
    }

    
    
}
