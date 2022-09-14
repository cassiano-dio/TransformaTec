package shopping;

import java.util.ArrayList;
import java.util.List;

//Herança da classe CartOperations
public class Cart extends CartOperations{

    List<Product> cartItems = new ArrayList<Product>();

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
            System.out.println("Marca do produto: " + product.getBrand());
            System.out.println("Descricao do produto: " + product.getDescription());
            System.out.println("Preco do produto: " + product.getPrice());
            System.out.println();
        }
    }

    //implementação do método abstrato da classe CartOperations
    @Override
    public void getCartTotalPrice() {

        //Stream reduce() que retorna a soma dos preços dos produtos no carrinho
        Double totalPrice = cartItems.stream()
        .map(cartItem -> cartItem.getPrice())
        .reduce(0.0, (subtotal, cartItem) -> subtotal + cartItem);

        System.out.println(totalPrice);

    }

    // @Override
    // public void orderCartAsc() {}

    // @Override
    // public void orderCartDesc() {}

    //implementação do método da classe CartOperations
    @Override
    public void listCartPrices() {

        //Stream map() que gera uma nova lista contendo os preços dos itens no carrinho
        List<Double> cartPrices = cartItems.stream().map(cartItem -> cartItem.getPrice()).toList();
        cartPrices.stream().forEach(cartPrice -> System.out.println(cartPrice));
    }

    
    //implementação do método da classe CartOperations
    @Override
    public void itemsCount() {

        //Stream count() que conta a quantidade de itens no carrinho
        Long itemsQt = cartItems.stream().count();
        System.out.println(itemsQt);

    }
    
}
