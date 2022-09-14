package classes;

public class CarGarage {

    public static void main(String[] args) {
        
        Car car = new Car("Saveiro", "VW");
        car.accelerate();
        car.brake();

        System.out.println(car.getModel());
        System.out.println(car.brand);
        //System.out.println(car.model);
        System.out.println(car.year);


    }
}
