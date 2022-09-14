import java.util.Scanner;

public class ChangeName {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Josh","Bambino","Henry"};

        for (String n : names) {
            System.out.println(n);
        }

        System.out.println("Informe o novo nome:");
        String name = scanner.nextLine();

        names[2] = name;

        for (String n : names) {
            System.out.println(n);
        }

    }

}
