package exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassCastExceptionExample {
    
    public static void main(String[] args) {

        String[] nameArray = new String[] { "Joao", "Maria"};

        //ArrayList<String> nameList = (ArrayList<String>) Arrays.asList(nameArray);

        List<String> nameList = Arrays.asList(nameArray);

        System.out.println(nameList);
        
    }

}
