package products;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class ProductStream {
    
    //Lista de objetos da classe Product
    private static List <Product> productsList = new ArrayList<Product>();
    public static void main(String[] args) {
        
        //Adicionando um novo item da classe Product
        productsList.add(new Product(01,"SmartPhone",5000.00));
        productsList.add(new Product(02,"Computer",15000.00));
        productsList.add(new Product(03,"Mouse",500.00));
        productsList.add(new Product(04,"Keyboard",1000.00));
        productsList.add(new Product(05,"Headset",1500.00));
        productsList.add(new Product(06,"Mouse Pad",50.00));
        productsList.add(new Product(07,"Headphone",150.00));

        //Métodos de Stream
        //Filtrando preços menores que 750.00 e retornando uma stream com os dados filtrados
        List<Double> priceList = productsList.stream()
        .filter(product -> product.getPrice() < 750.00)
        .map(product -> product.getPrice()).toList();

        //Lista de preços
        priceList.forEach(price -> System.out.println(price));
        System.out.println();


        //Filtrando produtos com base no preço menor que 750.00
        List<Product> pList = productsList.stream()
        .filter(product -> product.getPrice() < 750.00)
        .map(product -> product).toList();

        //Lista de produtos
        pList.forEach(product -> System.out.println(product.getId() + " " + product.getName() + " " + product.getPrice()));
        System.out.println();

        //Obter o produto com o maior valor de preço
        Product maxProduct = productsList.stream()
        .max((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();

        System.out.println(maxProduct.getId() + " " + maxProduct.getName() + " "+ maxProduct.getPrice());
        System.out.println();

        //Convertendo uma Lista em um Map (par chave-valor)
        Map<Integer, String> productsMap = productsList.stream().collect(Collectors.toMap(product -> product.getId(), product -> product.getName()));
        
        System.out.println(productsMap);

    }


}
