package Q2;

public class Car {
    private String model;
    private String licensePlate;
    private String type;

    public Car(String model, String licensePlate, String type) {
        this.model = model;
        this.licensePlate = licensePlate;
        this.type = type;
    }
    public void displayCar(){
        System.out.println("Car :-");
        System.out.println("Model : "+this.model);
        System.out.println("License  : "+this.licensePlate);
        System.out.println("Type  : "+this.type);


    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
