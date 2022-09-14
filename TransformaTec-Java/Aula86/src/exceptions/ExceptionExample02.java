package exceptions;

import java.util.ArrayList;
import java.util.Scanner;

class ItemNotFoundException extends RuntimeException{

    public ItemNotFoundException(String message){
        super(message);
    }

}


public class ExceptionExample02 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();

        list.add("Leite");
        list.add("Pao");
        list.add("Manteiga");
        list.add("Queijo");

        System.out.println("Informe o item buscado:");
        String item = scanner.nextLine();

        try {

            if (!list.contains(item)) {

                throw new ItemNotFoundException("Este item não está na lista!");
            
            } else {
                
                System.out.println("Item encontrado");
            }
        } catch (ItemNotFoundException ie) {

            System.out.println(ie.getMessage());

        }


    }

}
