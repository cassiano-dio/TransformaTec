package custom;

import java.util.Scanner;


class AgeException extends Exception {

    public AgeException(String message){
        super(message);
    }

}



public class AgeVerifier {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a idade:");
        Integer age = Integer.parseInt(scanner.nextLine());

        try {

            if (age < 18){

                throw new AgeException("A idade deve ser igual ou superior a 18");

            }else{

                System.out.println("Entrada permitida");

            }
            
        } catch (AgeException ae) {
            System.out.println(ae.getMessage());
        }

    }

}
