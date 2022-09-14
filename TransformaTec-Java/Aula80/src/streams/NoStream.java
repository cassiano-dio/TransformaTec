package streams;

import java.util.List;
import java.util.ArrayList;

public class NoStream {

    public static void main(String[] args) {
        

        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(7);
        numbers.add(9);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);
        numbers.add(23);
        numbers.add(13);
        numbers.add(2);
        numbers.add(99);

        //Quais são os números pares entre os 5 primeiros números da Lista

        for (int i = 0; i < 5; i++) {

            Integer number = numbers.get(i);
            
            if (number % 2 == 0) {
                System.out.println(number);
            }

        }

    }
    
}
