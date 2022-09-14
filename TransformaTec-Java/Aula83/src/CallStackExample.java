public class CallStackExample {
    
    public static Integer sub = 0;
    public static void main(String[] args) {
        
        Integer a = 10;
        Integer b = 20;

        System.out.println("Inicio da execucao do método 'main'");
        
        new CallStackExample().sumNumbers(a, b);
        
        System.out.println("Fim da execucao do método 'main'");
    }

    public void sumNumbers(Integer a, Integer b) {

        System.out.println("Inicio da execucao do método 'sumNumbers'");

        System.out.println("Soma de 'a' e 'b':" + (a + b));
        

        multiplyNumbers(a, b);
        
        System.out.println("Fim da execucao do método 'sumNumbers'");

    }

    public void multiplyNumbers(Integer a, Integer b) {


        System.out.println("Inicio da execucao do método 'multiplyNumbers'");

        System.out.println("Multiplicacao de 'a' e 'b':" + (a * b));
        
        sub = subtractNumbers(a, b);
        System.out.println(sub);
        
        System.out.println("Fim da execucao do método 'multiplyNumbers'");

    }

    public Integer subtractNumbers(Integer a, Integer b) {
        System.out.println("Inicio da execucao do método 'subtractNumbers'");
        System.out.println("Subtracao de 'a' e 'b':" + (a - b));
        System.out.println("Fim da execucao do método 'subtractNumbers'");
        return a -b;
    }


}
