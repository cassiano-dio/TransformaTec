package streams;

import java.util.Arrays;
import java.util.List;

public class Reducer01 {
    

    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6,7,8,9,10);

        Integer result = 0;

        for (Integer number : numbers) {
            result = result + number;
        }

        System.out.println("Soma sem stream: " + result);


        Integer resultStream = numbers.stream().reduce(0, (sum, number) -> sum + number); 

        System.out.println("Soma com stream reducer: " + resultStream);

        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");

        String resultString = letters.stream().reduce("", (part, letter)-> part + letter);

        //String concatenada de uma lista de letras
        System.out.println(resultString);

    }

}
