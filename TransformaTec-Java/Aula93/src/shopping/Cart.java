package shopping;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Product> cartItems = new ArrayList<Product>();

    //1 - add products
    //2 - remove products
    //3 - get product by id
    //4 - list products

    // buscar um produto cadastrado e adicionar na coleção de produtos do carrinho 
    public void addProduct(Integer id) {
        
        Product product = getProductById(id);
        addToCart(product);

    }

    // adicionando um produto na coleção do carrinho
    private void addToCart(Product product) {

        cartItems.add(product);

    }

    //remover item do carrinho
    public void removeProduct(Integer id) {
        Product product = getProductById(id);
        cartItems.remove(product);
    }

    //método para buscar um produto cadastrado no estoque
    private Product getProductById(Integer id) {

        //produto em estoque que será adicionado ao carrinho
        Product product = null;
        
        //Lista de produtos em estoque
        List<Product> products = new Products().getProducts();
        
        //procutando um elemento no estoque com base no id
        for (Product prod : products) {
            
            if (prod.getId() == id) {
                //elemento encontrado
                product = prod;
            }

        }

        return product;
    }

    //exibir o carrinho
    public void printCart(){
        for (Product product : cartItems) {
            System.out.println("Nome do produto: " + product.getName());
            System.out.println("Marca do produto: " + product.getName());
            System.out.println("Descricao do produto: " + product.getName());
            System.out.println("Preco do produto: " + product.getName());
            System.out.println();
        }
    }
    
}
