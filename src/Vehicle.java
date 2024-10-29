import java.util.Scanner;

public abstract class Vehicle implements Movable {
    private String brand;
    private String model;
    private int year;

    public abstract void move();


    public Vehicle(String brand, String model, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showInfo(){
        System.out.print("Brand:" + brand + "    Model:" + model + "    Year: " + year);
    }


}
