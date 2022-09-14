import java.util.Map;
import java.util.HashMap;

public class Map01 {
    
    public static void main(String[] args) {
        
        HashMap<String, Integer> agesMap = new HashMap<String, Integer>();

        agesMap.put("a",50);
        agesMap.put("b",40);
        agesMap.put("c",30);

        System.out.println(agesMap);

        System.out.println("Elemento 'c':" + agesMap.get("c"));

        System.out.println("Iterando o MAP");
        for (Map.Entry<String, Integer> age : agesMap.entrySet()) {
            System.out.println(age.getKey() + ": " + age.getValue());
        }
        

    }

}
