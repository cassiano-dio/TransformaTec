package classes;

public class CarCustom {

    //Criando um novo objeto da classe Car
    static Car car = new Car("abc1b99", "Saveiro Monstra","VW",1998,10);

    public static void main(String[] args) {

        System.out.println(car.getModel());
        System.out.println(car.licensePlate);
        System.out.println(car.getYear());
        System.out.println(car.getBrand());
        System.out.println(car.getHeight());

        car.getLow(8);

        System.out.println(car.getModel());
        System.out.println(car.getLicensePlate());
        System.out.println(car.getYear());
        System.out.println(car.getBrand());
        System.out.println(car.getHeight());
        
        

    }
    
}
