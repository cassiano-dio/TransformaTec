package lists;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSet01 {
    
    public static void main(String[] args) {
        
        LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>();

        numbers.add(7);
        numbers.add(8);
        numbers.add(2);
        numbers.add(4);

        System.out.println(numbers);

        //Criar um iterator "array" com os elementos do set
        Iterator<Integer> numbersIterator = numbers.iterator();

        System.out.println(numbersIterator);

        //varre o interator enquanto houverem elementos
        while (numbersIterator.hasNext()) {
            System.out.println(numbersIterator.next());
        }
    }
}
