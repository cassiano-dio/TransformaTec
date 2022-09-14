package organizer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java.util.Scanner;

import java.util.Comparator;

public class ExpenseStream {
    
    private static List<Expense> expenseList = new ArrayList<Expense>();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        // System.out.println("Informe a quantidade de boletos:");
        // int qt = Integer.parseInt(scanner.nextLine());

        // for (int i = 0; i < qt; i++) {

        //     int id = i;
            
        //     System.out.println("Informe o nome do boleto [" + i + "]:");
        //     String name = scanner.nextLine();

        //     System.out.println("Informe o valor do boleto [" + i + "]:");
        //     Double amount = Double.parseDouble(scanner.nextLine());

        //     System.out.println("Informe a data de vencimento do boleto [" + i + "]:");
        //     String expireDate = scanner.nextLine();

        //     System.out.println("Informe a categoria do boleto [" + i + "]:");
        //     String category = scanner.nextLine();

        //     expenseList.add(new Expense(id, name, amount, category, expireDate));

        // }

        expenseList.add(new Expense(1, "Agua", 50.00,"Fixa","15072022"));
        expenseList.add(new Expense(2, "Luz", 200.00,"Fixa","16072022"));
        expenseList.add(new Expense(3, "Janta", 150.00,"Extra","17072022"));
        expenseList.add(new Expense(4, "Farmacia", 450.00,"Saude","18072022"));
        expenseList.add(new Expense(5, "Carro", 850.00,"Extra","19072022"));
        expenseList.add(new Expense(6, "Dentista", 450.00,"Saude","20072022"));

        // for (Expense expense : expenseList) {
        //     System.out.println(expense.getName());
        //     System.out.println(expense.getAmount());
        //     System.out.println(expense.getExpireDate());
        //     System.out.println(expense.getCategory());

        //     System.out.println();
        // }

        //Criando stream para gerar uma lista apenas com os valores dos boletos
        List<Double> expenseAmountList = expenseList
                                            .stream()
                                            .map(expense -> expense.getAmount())
                                            .collect(Collectors.toList());
    
        System.out.println("Lista de valores dos boletos");
        expenseAmountList.forEach(amount -> System.out.println(amount));

        System.out.println("Valor total das despesas:");
        Double totalAmount = expenseAmountList.stream().reduce((double)0, (subtotal, expenseAmount) -> subtotal + expenseAmount);

        System.out.println(totalAmount);


        System.out.println("Total por categoria de despesa FIXA:");

        List<Double> categoryAmountList = expenseList
                                            .stream()
                                            .filter(expense -> expense.getCategory() == "Fixa")
                                            .map(expense -> expense.getAmount()).collect(Collectors.toList());

        Double categoryAmount = categoryAmountList.stream().reduce((double)0, (subtotal, expenseAmount) -> subtotal + expenseAmount);
        
        System.out.println(categoryAmount);

        Comparator<Expense> comparator = Comparator.comparing(Expense::getAmount);

        System.out.println("Despesa mais barata:");
        Expense cheaper = expenseList.stream().min(comparator).get();
        System.out.println(cheaper.getName());

        System.out.println("Despesa mais cara:");
        Expense expensive = expenseList.stream().max(comparator).get();
        System.out.println(expensive.getName());

        Map<String, List<String>> groupedExpenses = expenseList.stream()
        .collect(Collectors.groupingBy(Expense::getCategory, 
        Collectors.mapping(Expense::getName, Collectors.toList())));

        System.out.println("Despesas agrupadas:");
        System.out.println(groupedExpenses);


        Map < Integer, String > expenseMap = expenseList.stream()
            .collect(Collectors.toMap(p -> p.getId(), p -> p.getName()));
        
        System.out.println(expenseMap);


    }
}
