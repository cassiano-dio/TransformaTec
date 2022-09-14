import java.util.Scanner;

public class Bingo {
    
    public static void main(String[] args) {
        
        int[][] cartela = new int[3][3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {

                System.out.println("Informe o valor da posição " + i + " " + j);
                cartela[i][j] = scanner.nextInt();
            }

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cartela[i][j] + " ");
            }
            System.out.println();
        }

    }

}
