package exceptions;

public class NullPointerExceptionExample {
    
    public static void main(String[] args) {
        
        Integer number = null;

        if (number > 0) {
            System.out.println("Positivo");
        }
    }

}
