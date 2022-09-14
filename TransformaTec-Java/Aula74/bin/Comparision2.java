package classes;
import java.util.Arrays;

public class Comparision2 {

    public static void main(String[] args) {
        
        int array01[] = {1,2,3};
        int array02[] = {1,2,3};

        if (Arrays.equals(array01, array02)) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

    }
    
}
