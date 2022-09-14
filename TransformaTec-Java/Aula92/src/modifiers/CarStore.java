package modifiers;

import classes.Car;

public class CarStore {

    public static void main(String[] args) {
        
        Car car = new Car("Saveiro", "VW");
        car.accelerate();
        car.brake();

        System.out.println(car.getModel());
        System.out.println(car.year);


    }
    
}
