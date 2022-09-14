package classes;
import java.util.Scanner;

public class Winner {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Faça a sua aposta!\nEscola um número entre 1 e 100:");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Premio minimo");
                break;
            case 12:
                System.out.println("Premio medio");
                break;
            case 33:
                System.out.println("Premio máximo");
                break;
            default:
                System.out.println("Perdeu tudo!");
                break;
        }

        scanner.close();
    }
}
