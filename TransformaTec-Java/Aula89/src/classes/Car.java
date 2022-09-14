package classes;

//Criando uma classe
public class Car {

    //Declarando os atributos
    protected String licensePlate;
    private String model;
    private String brand;
    private Integer year;
    private Integer height;

    //Método construtor de um novo objeto
    public Car(String licensePlate, String model, String brand, Integer year, Integer height) {

        this.licensePlate = licensePlate;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.height = height;

    }

    //Métodos getters e setters
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
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

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }

    public void getLow(Integer cm){

        this.height = height - cm;

    }
    
}
