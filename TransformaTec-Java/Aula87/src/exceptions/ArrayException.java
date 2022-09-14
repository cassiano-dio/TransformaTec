package exceptions;

import java.util.ArrayList;
import java.util.List;

public class ArrayException {

    static void getItem(List<String> itens, Integer i){

        if(itens.size() <= i){
            throw new IndexOutOfBoundsException("Item nao encontrado!");
        }

        String item = itens.get(i);

        System.out.println(item);

    }

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<String>();

        list.add("Sapato");
        list.add("Meia");
        list.add("Tenis");
        list.add("Bermuda");
        list.add("Camisa");
        list.add("Blusa");

        Integer i = 6;

        getItem(list, i);
    }
    
}
