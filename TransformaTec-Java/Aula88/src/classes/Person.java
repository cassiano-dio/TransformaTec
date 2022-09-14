package classes;

public class Person {

    //Atributos
    private String name;
    private Integer age;
    String profession;


    //Métodos

    //Método construtor
    public Person(String name, Integer age, String profession){

        this.name = name;
        this.age = age;
        this.profession = profession;

    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }
}
