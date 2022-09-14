package inheritance;

public class CreateVehicle {

    public static void main(String[] args) {
        
        Car car = new Car("Celtinha", "Chevrolet","Prata", 15000.00);

        //Métodos herdados de Vehicle
        System.out.println(car.getModel());
        System.out.println(car.getBrand());
        System.out.println(car.getIsOn());

        //Métodos da classe Car
        System.out.println(car.getColor());
        System.out.println(car.getPrice());
        car.turnOnOff();
        System.out.println(car.getIsOn());

    }
    
}
