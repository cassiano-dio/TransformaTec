public class NameList {
    

    public static void main(String[] args) {
        
        String[] names = {"Joao", "Jose", "Maria"};

        // lendo o vetor sem loop

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        // int i = 0 - inicialização do contador de repetições
        // i < names.length - condição de parada do loop (no caso é o comprimento do vetor)
        // i++ - iteração para incrementar o contador

        for (int i = 0; i < names.length; i++) {

            System.out.println(names[i]);

        }
    }

}
