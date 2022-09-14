import java.util.Scanner;

public class CheckAgesArray {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] ages = new int[5];

        for (int i = 0; i < ages.length; i++) {

            System.out.println("Informe a idade: " + i);
            ages[i] = scanner.nextInt();

        }

        for (int age : ages) {
            
            String message = age < 18 ? "Menor" : "Maior";
            System.out.println(message);

        }

    }

}
