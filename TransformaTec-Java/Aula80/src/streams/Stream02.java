package streams;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

class Product{

    int id;
    String name;
    Double price;

    //método construtor
    public Product(int id, String name, Double price) {

        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Stream02 {
    
    public static void main(String[] args) {
        

        List<Product> products = new ArrayList<Product>();

        products.add(new Product(1,"Computador Positivo", 0.50));
        products.add(new Product(2,"Celular Tijolao", 1.50));
        products.add(new Product(3,"Iphone", 10000.50));
        products.add(new Product(4,"Cabo USB", 10.00));
        products.add(new Product(5,"Bateria", 200.00));

        //filtrando a lista de produtos com base no preço menor que 150
        Stream<Product> filteredProducts = products.stream().filter(product -> product.price < 150);

        System.out.println();

        filteredProducts.forEach(
            p -> System.out.println(p.name + ":" + p.price + ":" + p.id)
        );
    }

}
