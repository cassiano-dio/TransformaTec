package inheritance;

class Animal {

    //atributo da classe pai
    private String food;

    //método construtor da classe pai
    public Animal(String food) {
        this.food = food;
    }

    //método da classe pai
    public void eat(){
        System.out.println("Come " + this.food);
    }
    
}

//Classe Cat herdando atributos e métodos da classe Animal
class Cat extends Animal {

    private String name;

    public Cat(String food, String name) {
    
        //chamando o construtor da classe pai
        super(food);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}

class Dog extends Animal {

    private String name;
    private String pedigree;

    public Dog(String food, String name, String pedigree) {
        super(food);
        this.name = name;
        this.pedigree = pedigree;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }
    public String getPedigree() {
        return pedigree;
    }
    
}

public class Animals{
    public static void main(String[] args) {
        
        Cat cat = new Cat("Sardinha","Mimo");
        System.out.println("O gato " + cat.getName());
        cat.eat();

        Dog dog = new Dog("Racao e umas porcarias que ele acha", "Pudim", "Golden");
        System.out.println("O cachorro " + dog.getName() + " da raca " + dog.getPedigree());
        dog.eat();


    }
}
