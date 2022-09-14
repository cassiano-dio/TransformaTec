public class ArrayWhile {

    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5, 6};
               //indices 0, 1, 2, 3, 4, 5, 6

        int count = 0;

        //do while
        do {
            System.out.println(numbers[count]);
            count ++;
        } while (count <= numbers.length-1);

        count = 0;

        //while
        while(count <= numbers.length - 1){
            System.out.println(numbers[count]);
            count ++;
        }

    }
}
