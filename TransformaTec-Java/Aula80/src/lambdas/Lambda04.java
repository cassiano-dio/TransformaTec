package lambdas;

interface Hello{

    //função abstrata
    void abstractFunction(int i);

    //unicamente uma função abstrata
    //void abstractFunction2();

    //nao é uma função abstrata
    default void normalFunction(){
        System.out.println("Olá mundo");
    }

}

public class Lambda04 {
    
    public static void main(String[] args) {

        Hello hello = (int a) -> System.out.println(2 * a);

        hello.abstractFunction(5);

    }
}
