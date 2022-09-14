package bank;

public class Account {
    
    Integer number;
    Double amount;
    String owner;

    public Account(Integer number, Double amount, String owner) {

        this.number = number;
        this.amount = amount;
        this.owner = owner;

    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void deposit(Double value) throws ArithmeticException{

        if(value <= 0){

            throw new ArithmeticException("Valor inválido!");

        }else{

            this.amount = this.amount + value;
            
        }

    }

}
