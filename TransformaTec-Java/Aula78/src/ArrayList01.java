import java.util.ArrayList;

public class ArrayList01{

    public static void main(String[] args) {
        
        //declarando um novo arraylist
        ArrayList <Integer> numbers = new ArrayList<Integer>();
        
        //add itens
        numbers.add(500);
        numbers.add(1000);
        numbers.add(2500);
        numbers.add(14000);
        numbers.add(5030);

        //imprimindo o arraylist
        System.out.println("Array original: " + numbers);

        //buscando um item no arraylist
        System.out.println("Item na posicao 4: " + numbers.get(4));

        //removendo um item no arraylist
        numbers.remove(1);

        //imprimindo o arraylist após a exclusao
        System.out.println("Array com exclusao: " + numbers);

        //verificando se o arraylist contem determinado valor
        if (numbers.contains(91500)) {
            System.out.println("Contem");
        } else {
            System.out.println("Nao contem");
        }

    }

}