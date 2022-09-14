import java.util.Scanner;

public class Decision {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String name = scanner.nextLine();
        
        System.out.println("Digite sua idade:");
        int num = scanner.nextInt();

        // Usando if else...
        if (num >= 18) {
            System.out.println("Bem vindo " + name + " - " + num +"anos...");
        } else {
            System.out.println("Sua idade foi recusada...");
        }

        // Decisao tenaria...
        String msg = num < 18 ? "Menor de 18 anoos..." : "Maior de 18 anos...";
        System.out.println(msg);

        scanner.close();
    }
}
