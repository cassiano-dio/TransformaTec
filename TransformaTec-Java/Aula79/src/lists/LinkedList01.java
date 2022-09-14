package lists;

import java.util.List;
import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {
        
        List<Integer> numbers = new LinkedList<Integer>();

        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        numbers.add(0);
        numbers.add(9);
        numbers.add(12);
        numbers.add(14);

        // buscando objeto por um index
        System.out.println(numbers.get(4));

        // buscando um index de um objeto com base no objeto
        System.out.println(numbers.indexOf(0));


    }
    
}
