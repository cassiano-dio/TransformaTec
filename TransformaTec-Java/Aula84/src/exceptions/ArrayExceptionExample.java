package exceptions;
import java.util.ArrayList;
import java.util.List;

public class ArrayExceptionExample {
    
    static void getName(List<String> names) throws IndexOutOfBoundsException{

        Integer i = 3;


        if(names.size() <= i){
            throw new IndexOutOfBoundsException("Index fora do array");
        }

        String name = names.get(i);

        System.out.println(name);

    }

    public static void main(String[] args) {
        
        List<String> names = new ArrayList<String>();

        names.add("Cassiano"); //0
        names.add("Cassia");   //1
        names.add("Cassi");    //2

        getName(names);

    }
}
