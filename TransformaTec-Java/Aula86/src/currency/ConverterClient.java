package currency;

import java.util.Scanner;

public class ConverterClient {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor em reais:");

        Double brlValue = Double.parseDouble(scanner.nextLine());

        CurrencyConverter converter = new CurrencyConverter();

        Double convertedAmount = converter.convertBRLtoUSD(brlValue);

        System.out.println("Valor convertido para Dolar:" + convertedAmount);

        scanner.close();
    }

}
