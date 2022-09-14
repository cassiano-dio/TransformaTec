package shopping;


//Classe abstrata com métodos para ler dados dos carrinhos de compras
public abstract class CartOperations {

    //método para somar todos os preços dos produtos em um carrinho
    public abstract void getCartTotalPrice();

    // public void orderCartDesc(){}

    // public void orderCartAsc(){}

    //cria uma lista apenas com os preços dos produtos em um carrinho
    public void listCartPrices(){}

    //retorna a quantidade de itens de um carrinho
    public void itemsCount(){}
    
}
