package lambdas;

interface Sum{

    int add(int a, int b);

}

public class Lambda03 {
    

    public static void main(String[] args) {
        
        Sum summer = (a,b)->(a+b);

        System.out.println(summer.add(50, 60));

    }

}
