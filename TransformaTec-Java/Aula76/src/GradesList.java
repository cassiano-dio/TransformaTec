import java.util.Scanner;

public class GradesList {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int grades[] = new int[4];

        int bim = 0;

        // loop for
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Informe a nota do " + (i + 1) +" bimestre:");
            grades[i] = scanner.nextInt();
        }

        // loop for each
        for (int grade : grades) {

            System.out.println("Nota do " + (bim + 1) + " bimestre:" + grade);

            bim ++;
        }

        scanner.close();
    }
    
}
