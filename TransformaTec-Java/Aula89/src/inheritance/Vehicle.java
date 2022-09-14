package inheritance;

public class Vehicle {
    

    public String model;
    public String brand;
    public Boolean isOn = false;

    //super()
    public Vehicle(String model, String brand) {

        this.model = model;
        this.brand = brand;

    }

    public void turnOnOff(){
        this.isOn = !isOn;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

}
