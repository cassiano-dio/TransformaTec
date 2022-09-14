package currency;

public class InvalidCurrencyValueException extends RuntimeException{

    public InvalidCurrencyValueException(String message){
        super(message);
    }

}
