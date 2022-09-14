public class ComparingArrays {
    

    public static void main(String[] args) {
        
        int numbers0[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int numbers1[] = {1, 2, 3, 4, 5, 6, 7, 8};

        if (numbers0 == numbers1) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

        Boolean same = true;

        for (int i = 0; i < numbers0.length; i++) {
            
            if (numbers0[i] != numbers1[i]) {
                same = false;
            }

            System.out.println("Numbers0:" + numbers0[i]);
            System.out.println("Numbers1:" + numbers1[i]);

        }

        if(!same) {
            System.out.println("Diferentes");
        }else{
            System.out.println("Iguais");
        }
    }

}
