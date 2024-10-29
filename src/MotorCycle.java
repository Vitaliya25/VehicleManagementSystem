import java.util.Scanner;

public class MotorCycle extends Vehicle {
    private int engineCapacity;

    public MotorCycle(String brand, String model, int year,int engineCapacity) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void move() {
        System.out.println("The motorcycle is moving.");
//        this.showInfo();
    }

    @Override
    public void showInfo() {
        System.out.print("Motorcycle:   ");
        super.showInfo();
        System.out.println("    Engine capacity:" + engineCapacity);
    }

}
