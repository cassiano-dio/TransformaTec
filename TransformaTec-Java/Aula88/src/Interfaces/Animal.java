package Interfaces;

interface AnimalActions{

    //métodos abstratos - sem corpo de implementação
    public void makeSound();

    public void move();

    public default void eat(){

        System.out.println("Come");

    };

}


class Dog implements AnimalActions{

    @Override
    public void makeSound() {
        System.out.println("Auauauauau");
    }

    @Override
    public void move() {
        System.out.println("Corre dog");
        
    }

    public void eat(){
        
    }

    
}


class Bird implements AnimalActions{

    @Override
    public void makeSound() {
        System.out.println("piupiupiupiupiu");
        
    }

    @Override
    public void move() {
        System.out.println("Voa passarinho");
        
    }
    
}


public class Animal {
    
    public static void main(String[] args) {

        Dog yellowDog = new Dog();
        
        yellowDog.makeSound();
        yellowDog.move();

        Bird louro = new Bird();
        louro.makeSound();
        louro.move();
        
    }

}
