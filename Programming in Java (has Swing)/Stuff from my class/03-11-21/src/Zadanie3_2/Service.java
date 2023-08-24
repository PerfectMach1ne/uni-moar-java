package Zadanie3_2;

public class Service {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setWheelSize(27);
        vehicle.setManufacturer("Suzuki");
        vehicle.setColor("Bialy");
        vehicle.setModel("Swift");
        System.out.println(vehicle.getModel());
    }
}
