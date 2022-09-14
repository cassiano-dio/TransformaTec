package maps;

import java.util.Map;
import java.util.HashMap;

public class HashMap01 {
    
    public static void main(String[] args) {
        
        //Criando um Map com uma chave do tipo Integer e um valor do tipo String
        Map<Integer, String> names = new HashMap<Integer, String>();

        names.put(0,"Cassiano");
        names.put(4,"Jose");
        names.put(9,"Cassiano");
        names.put(3,"Maria");
        names.put(1,"Cecilia");

        //Imprimindo o Map de nomes
        System.out.println(names);

        //Imprimindo o conjunto de chaves
        System.out.println(names.keySet());

        //Imprimindo o conjunto de valores
        System.out.println(names.values());

        //Imprimindo o conjunto de entradas
        System.out.println(names.entrySet());

        //Atyalizanod um valor
        names.put(1, "Mariana");

        ///Inserindo um valor caso a chave não exista
        names.putIfAbsent(10, "Joana");

        //Tentando inserir um valor com uma chave existente
        System.out.println(names.putIfAbsent(1, "Marianne"));

        System.out.println(names);

        //Removendo um item com base na chave
        System.out.println(names.remove(3));

        //Removendo um item com base na relação chave-valor
        System.err.println(names.remove(9,"Cassiano"));

        

    }

}
