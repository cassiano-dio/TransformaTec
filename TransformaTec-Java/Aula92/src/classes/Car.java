package classes;

public class Car {

    //private: visível apenas na propria classe ou por herança
    private String model;

    //protected: visível apenas dentro do pacote ou da mesma classe
    protected String brand;

    //public: visível para todas as entidades
    public Integer year;

    public Car(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public void accelerate() {
        System.out.println("Vroooom");
    }

    public void brake(){
        System.out.println("Shhhh");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }
    
}
