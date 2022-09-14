import java.util.LinkedList;

public class LinkedList01 {
    
    public static void main(String[] args) {
        
        LinkedList<String> names = new LinkedList<String>();

        names.add("Cassiano");
        names.add("José");
        names.add("Paulo");
        names.add("João");
        names.add("Cassiano");
        names.add("José");
        names.add("Paulo");
        names.add("João");

        System.out.println("Todos os nomes:");
        System.out.println(names);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        names.remove(3);
        names.remove("Cassiano");

        System.out.println("Com nomes removidos:");
        System.out.println(names);
    }

}
