package shopping;

//criando uma classe de erro personalizado do tipo unchecked - tempo de execução
//herança da classe pai
public class OptionNotFoundException extends RuntimeException{
    
    public OptionNotFoundException(String message){
        super(message);
    }

}
