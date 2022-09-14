package bank;

import java.util.Scanner;

public class ManageAccount {
    
    static Scanner scanner = new Scanner(System.in);

    public static Account createAccount(Integer number, Double amount, String owner) throws IllegalArgumentException{

        if(number == null || amount == null || owner == ""){

            throw new IllegalArgumentException("Valores nulos invalidos");

        }else{

            Account account = new Account(number, amount, owner);

            System.out.println("Conta criada!");
            System.out.println(account.getOwner());
            System.out.println(account.getNumber());
            System.out.println(account.getAmount());
    
            return account;
        }
    }

    public static void main(String[] args) {
    
        System.out.println("Informe o nome do correntista:");
        String owner = scanner.nextLine();

        System.out.println("Informe o numero da conta");
        Integer number = Integer.parseInt(scanner.nextLine());

        System.out.println("Informe o saldo inicial da conta:");
        Double amount = Double.parseDouble(scanner.nextLine());

        Account account = createAccount(number, amount, owner);

        System.out.println("Valor de depósito:");
        Double value = Double.parseDouble(scanner.nextLine());

        account.deposit(value);

        System.out.println("Saldo atual:" +  account.getAmount());

    }

}
