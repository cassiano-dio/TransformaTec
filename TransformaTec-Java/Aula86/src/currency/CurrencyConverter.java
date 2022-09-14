package currency;

public class CurrencyConverter {
    
    public Double convertBRLtoUSD(Double value){

        Double convertedAmount = 0.0;

        try {
            if (value <= 0.0) {
            
                throw new InvalidCurrencyValueException("Valor inválido");
            
            } else {

                convertedAmount = value / 5.50;
            }
            

        } catch (InvalidCurrencyValueException e) {

            System.out.println(e.getMessage());
        
        }

        return convertedAmount;
        
    }
}
