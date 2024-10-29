import java.util.ArrayList;

public class Garage {
    ArrayList<Vehicle> vehicles  = new ArrayList<>();

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void showVehicles(){
        for(Vehicle vehicle : vehicles){
            vehicle.showInfo();
        }
    }

    public void  moveAll(){
        for(Vehicle vehicle : vehicles){
            vehicle.move();
        }
    }
}
