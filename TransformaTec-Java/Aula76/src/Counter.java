public class Counter {
    
    public static void main(String[] args) {
        
        int counter = 0;

        //incrementando o contador
        do {
            counter ++;
            System.out.println(counter); ///5
        } while (counter < 5);

        //decrementando o contador
        do{
            counter --;
            System.out.println(counter);
        }while (counter > 0);

    }

}
