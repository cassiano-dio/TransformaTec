package interfaces;

interface AnimalActions{

    //Métodos abstratos - sem corpo
    public void emitSound(String sound);
    public void move();

    //Método concreto
    public default void eat(String food){
        //Corpo do método
        System.out.println("Come: " + food);
    }


}


class Dog implements AnimalActions{

    @Override
    public void emitSound(String sound) {
        
        System.out.println(sound);
        
    }

    @Override
    public void move() {
        System.out.println("Run");
        
    }
    
}

class Cat implements AnimalActions{

    @Override
    public void emitSound(String sound) {
        
        System.out.println(sound);
        
    }

    @Override
    public void move() {
        System.out.println("Jump");
    }
    
}

public class Animal {
    
    public static void main(String[] args) {
        
        Dog pudim = new Dog();

        pudim.emitSound("auauauauauauau");
        pudim.move();
        pudim.eat("Racao");

        Cat mimo = new Cat();

        mimo.emitSound("miaaaaaaaaaaaaaaaaaauuuuuuuuuuuu");
        mimo.move();
        mimo.eat("Sardinha");

        
    }

}
