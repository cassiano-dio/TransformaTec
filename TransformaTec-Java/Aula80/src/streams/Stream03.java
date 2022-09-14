package streams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product{

    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {

        super();
        this.id = id;
        this.name = name;
        this.price = price;    

    }
}

public class Stream03 {

    public static void main(String[] args) {

        List<Product> cart = new ArrayList<Product>();

        cart.add(new Product(1,"Carregador", 200));
        cart.add(new Product(2,"Teclado", 700));
        cart.add(new Product(3,"Fone", 800));
        cart.add(new Product(4,"Mouse", 300));

        //Obtendo todos os produtos com preço maior que 300
        Stream<Product> stream = cart.stream().filter(product -> product.price > 300);

        //Obtendo a quantidade de produtos com preço maior que 300
        double stream2 = cart.stream().filter(product -> product.price > 300).count();

        System.out.println("Quantidade de produtos: " + stream2);

        stream.forEach(
            product -> System.out.println(product.id + "-" + product.name + ":" + product.price)
        );
    }
    
}
