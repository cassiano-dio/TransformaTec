package sets;

import java.util.Set;
import java.util.HashSet;

public class HashSet01 {

    public static void main(String[] args) {

        Set<Integer> numbers01 = new HashSet<Integer>();

        numbers01.add(1);
        numbers01.add(2);
        numbers01.add(3);
        numbers01.add(4);
        //não aceita valore repetidos
        numbers01.add(4);

        System.out.println(numbers01);


        Set<Integer> numbers02 = new HashSet<Integer>();

        numbers02.add(7);
        numbers02.add(8);
        numbers02.add(2);
        numbers02.add(4);

        System.out.println(numbers02);

        //união de dois conjuntos
        numbers02.addAll(numbers01);

        System.out.println(numbers02);
    }
    
}
