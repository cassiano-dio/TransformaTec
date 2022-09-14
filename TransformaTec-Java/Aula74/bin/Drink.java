package classes;
import java.util.Scanner;

public class Drink {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fala a idade e passa o RG:");

        int age = scanner.nextInt();

        //operador ternário
        String msg = age < 18 ? "Não pode ir na baladinha" : "Pode ir na baladinha";

        System.out.println(msg);

        scanner.close();

    }
    
}
