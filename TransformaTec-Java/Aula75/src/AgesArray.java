import java.util.Scanner;

public class AgesArray {
    
    public static void main(String[] args) {
        
        int[] age = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < age.length; i++) {

            System.out.print("Informe a idade " + i + ":");
            age[i] = scanner.nextInt();
        }

        for (int a : age) {
            System.out.println("Idade: " + a);
        }

    }

}
