package classes;

public class RaceCar extends Car{

    public Integer number;

    public RaceCar(String model, String brand, Integer number) {
        //chamando o método construtor da classe Car
        super(model, brand);

        //definindo um atributo da classe RaceCar
        this.number = number;
        
    }

    public void sound(String sound){
        System.out.println(sound);
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    //sobrescevendo o método da superclasse Car
    public void accelerate(){

        System.out.println("Vrriiiiiiuuuuummmmmmm");
    }
    
}
