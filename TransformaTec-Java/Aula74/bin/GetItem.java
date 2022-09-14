package classes;
import java.util.Scanner;
public class GetItem {
    
    public static void main(String[] args) {

        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        int found=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número de 0 a 10: ");
        int number = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == number) {
                found = numbers[i];
            }

        }

        if (found == 0) {
            System.out.println("Número não encontrado!");
        }else{
            System.out.println("Número encontrado!");
        }

        scanner.close();
    }
}
