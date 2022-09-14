class Person {
    
    private static int year = 2018;
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display(){
        System.out.println("Nome: "+this.name);
        System.out.println("Idade: "+this.age);
        System.out.println("Ano: "+Person.year);
    }
}

public class ObjectArray{

    public static void main(String[] args) {
        
        Person persons[] = new Person[3];

        persons[0] = new Person("Cassiano", 32);
        persons[1] = new Person("Jose", 32);
        persons[2] = new Person("Claudio", 32);

        for (int i = 0; i < persons.length; i++) {
            persons[i].display();
            System.out.println();
        }

    }

}