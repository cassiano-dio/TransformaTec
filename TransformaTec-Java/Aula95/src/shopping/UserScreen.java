package shopping;

import java.util.List;
import java.util.Scanner;

// Classe que gera um menu de opções para o usuário com métodos implementados da interface
public class UserScreen implements UserInterface{

    //criando o carrinho de compras
    Cart cart = new Cart();

    //opção do usuário
    private int opt = 0;

    //construtor que inicia o menu
    public UserScreen(){
        menu();
    }

    //método de opções iniciais do menu
    @Override
    public void startScreen() {
        
        System.out.println("1 - Menu de produtos");
        System.out.println("2 - Itens no carrinho");
        System.out.println("3 - Quantidade de itens no carrinho");
        System.out.println("4 - Listar preços do carrinho");
        System.out.println("5 - Preço total do carrinho");
        System.out.println("0 - Sair");
        
    }

    //método de opções para adicinar e remover produtos do carrinho
    @Override
    public void productsMenu() {
        
        System.out.println("1 - Adicionar produto ao carrinho");
        System.out.println("2 - Remover produto do carrinho");
        System.out.println("0 - Sair");
        
    }

    //iniciando a interface de usuário com as opções de menu
    @Override
    public void menu() {

        do{
            //renderiza o menu inicial
            startScreen();

            //pega opção do usuárop pelo teclado
            getUserInput();
    
            //selecioda de acordo com a opção do usuário
            switch (opt) {
                case 1:

                    //lista de produtos em estoque
                    displayProducts();

                    //menu de produtos para adicionar ou remover do carrinho
                    productsMenu();

                    //opção do usuário
                    getUserInput();

                    //mostra o menu de opções para o usuário
                    subMenu();
                    break;
                case 2:

                    //mostra lista de produtos no carrinho
                    showCart();
                    break;
                case 3:
                    showCartQuantity();
                    break;
                case 4:
                    showCartPrices();
                    break;
                case 5:
                    showCartTotalPrice();
                    break;
                case 0:
                    //Saindo fora
                    System.out.println("Bye!");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }while(opt != 0);
        
    }


    //menu de produtos para adicionar ou remover do carrinho
    private void subMenu() {

        switch (opt) {
            case 1:
                addProductToCart();
                showCart();
                break;
            case 2:
                removeProductFromCart();
                break;
            default:
                break;
        }
    }

    //exibindo a lista de produtos em estoque
    @Override
    public void displayProducts() {
        
        List<Product> products = new Products().getProducts();

        for (Product prod: products) {
            System.out.println("Id do produto: " + prod.getId());
            System.out.println("Nome do produto: " + prod.getName());
            System.out.println("Marca do produto: " + prod.getBrand());
            System.out.println("Descricao do produto: " + prod.getDescription());
            System.out.println("Preco do produto: " + prod.getPrice());
            System.out.println();
            
            System.out.println();
        }
        
    }

    //método para pegar a opção do usuáro pelo teclado
    @Override
    public int getUserInput() {

        System.out.println("Sua opcao:");
        Scanner scanner = new Scanner(System.in);
        opt = Integer.parseInt(scanner.nextLine());
        return opt;
        
    }

    //método para adicionar um produto ao carrinho pelo id
    public void addProductToCart(){

        int id = getUserInput();
        cart.addProduct(id);

    }

    //listando o carrinho
    public void showCart(){

        System.out.println(" -> Itens do carrinho:");

        cart.printCart();
    }

    //quantidade de itens do carrinho
    private void showCartQuantity() {
        System.out.println(" -> Total de itens no carrinho");
        cart.itemsCount();
    }

    
    private void showCartTotalPrice() {
        System.out.println(" -> Valor total do carrinho");
        cart.getCartTotalPrice();
    }

    //apresentando lista de preços do carrinho
    private void showCartPrices() {
        System.out.println(" -> Lista de preços do carrinho: ");
        cart.listCartPrices();
    }


    //exclui um produto do carrinho
    public void removeProductFromCart(){

        int id = getUserInput();
        cart.removeProduct(id);

    }
    
}
