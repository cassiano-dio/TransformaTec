import java.util.Scanner;

public class HelloBrother {
    public static void main(String[] args) {
        
        Scanner scann = new Scanner(System.in);

        System.out.println("Informe seu nome: ");

        String name = scann.nextLine();

        System.out.println("Informe sua idade: ");

        int age = scann.nextInt();

        System.out.println("Nome informado: " + name + "\n idade informada: " + age); 

        scann.close();

    }
}
