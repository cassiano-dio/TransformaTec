package classes;
import java.util.Scanner;
import java.util.Arrays;

public class GetItem2 {
    
    public static void main(String[] args) {
        
        String names[] = {"Paulo", "Jose", "Caio"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String name = scanner.nextLine();

        if (Arrays.asList(names).contains(name)) {

            System.out.println("Nome econcontrado, você é um convidado!");

        } else {

            System.out.println("Seu nome não está na lista, vaza penetra!");

        }

        scanner.close();
    }
}
