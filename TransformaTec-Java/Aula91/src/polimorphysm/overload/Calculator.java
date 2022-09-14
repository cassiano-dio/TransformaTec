package polimorphysm.overload;

class Sum {

    void soma(int a){
        System.out.println(a + a );
    }

    void soma(Double a){
        System.out.println(a + a );
    }

    void soma(int a, int b){
        System.out.println(a + b);
    }

    void soma(int a, int b, int c){
        System.out.println(a + b + c);
    }

}

public class Calculator {

    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;
        int c = 15;

        Sum sum = new Sum();

        sum.soma(a, b, c);
        sum.soma(a);
        sum.soma(5.5);
        sum.soma(a, b);




    }
    
}
