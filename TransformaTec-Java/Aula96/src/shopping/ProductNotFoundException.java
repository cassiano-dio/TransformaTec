package shopping;

//criando uma classe de erro personalizado do tipo unchecked - tempo de execução
//herança da classe pai
public class ProductNotFoundException extends Exception{

    public ProductNotFoundException(String message) {
        super(message);
    }
}
