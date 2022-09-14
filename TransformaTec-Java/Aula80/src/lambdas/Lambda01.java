package lambdas;

import java. util.List;
import java.util.ArrayList;

public class Lambda01{

    public static void main(String[] args) {
        
        List<String> names = new ArrayList<String>();

        names.add("José");
        names.add("Josué");
        names.add("Joseph");
        names.add("Josefo");

        names.forEach(
            //expressão - função lambda
            (n) -> System.out.println(n)
        );

    }

}