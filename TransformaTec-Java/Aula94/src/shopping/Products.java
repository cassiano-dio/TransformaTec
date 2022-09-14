package shopping;

import java.util.ArrayList;
import java.util.List;

//Collections

public class Products {
    
    //lista de produtos - estoque
    private List<Product> products = new ArrayList<Product>();

    //construtor da classe que chama o método de carregar a lista de produtos  - estoque
    public Products() {
        this.storeItems();
    }

    //listagem de produtos em estoque
    public List<Product> getProducts(){
        return products;
    }

    //método para armazenamento inicial dos produtos em estoque
    private void storeItems() {

        this.products.add(new Product(products.size(), "Perfume", "Boticário", "Cheiroso", 100.00, 10.00));
        this.products.add(new Product(products.size(), "Sabonete", "Boticário", "Cheiroso demais", 10.00, 10.00));
        this.products.add(new Product(products.size(), "Oleo Mineral", "Boticário", "Bem cheiroso", 30.00, 10.00));
        this.products.add(new Product(products.size(), "Shampoo", "Boticário", "Bom", 100.00, 15.00));
        this.products.add(new Product(products.size(), "Desodorante", "Boticário", "Cheiro bom", 20.00, 10.00));
        this.products.add(new Product(products.size(), "Creme de mão", "Boticário", "Barato", 30.00, 10.00));
        this.products.add(new Product(products.size(), "Batom", "Boticário", "Bonito", 50.00, 10.00));


    }

}
