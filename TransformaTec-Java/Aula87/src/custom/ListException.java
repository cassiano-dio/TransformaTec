package custom;

import java.util.ArrayList;
import java.util.Scanner;

class ItemNotFoundException extends RuntimeException{

    public ItemNotFoundException(String message){
        super(message);
    }

}


public class ListException {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        list.add("Pao");
        list.add("Manteiga");
        list.add("Cafe");
        list.add("Leite");
        list.add("Geleia");
        list.add("Acucar");

        System.out.println("Informe o item a ser buscado:");
        String item = scanner.nextLine();

        try {

            if( !list.contains(item) ){
                throw new ItemNotFoundException("Item nao encontrado na lista.");
            }else{
                System.out.println("Item encontrado na lista.");
            }

        
        } catch (ItemNotFoundException ie) {
            //TODO: handle exception
            System.out.println(ie.getMessage());
        }

    }
    
}
