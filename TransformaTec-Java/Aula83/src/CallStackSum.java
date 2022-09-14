import java.util.Scanner;

public class CallStackSum {

    public Integer sumNumbers(Integer n1, Integer n2){

        System.out.println("Somando números!");

        Integer sum = n1 + n2;

        return sum;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro numero:");
        Integer number1 = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Informe o segundo numero:");
        Integer number2 = Integer.parseInt(scanner.nextLine());

        scanner.close();

        CallStackSum callSum = new CallStackSum();

        Integer sumInteger = callSum.sumNumbers(number1, number2);

        System.out.println(sumInteger);

    }



}
