public class NamesMatrix {
    public static void main(String[] args) {

        String names[][] = {{"Cassiano","Caio"},{"Marcos","Joao"}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <2; j++) {
                System.out.println("Name [" + i + "-" + j + "]: " + names[i][j]);
            }
        }
    }
}
