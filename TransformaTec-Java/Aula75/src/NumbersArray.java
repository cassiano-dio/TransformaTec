public class NumbersArray {
    
    public static void main(String[] args) {
        
        int numbers[] = new int[5];
        //int numbers2[] = new int[5];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = i;
            //numbers2[i] = i;

        }

        //System.out.println(numbers);
        //System.out.println(numbers2);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
