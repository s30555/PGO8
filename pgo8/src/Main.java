public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "E30", 1988, 30000, 2500);
        Truck truck = new Truck("Fiat", "500", 2022, 1000, 600, 5);
        System.out.println(car + "Car fuel efficiency: " + car.calculateFuelEfficiency());
        System.out.println(truck + "Truck fuel efficiency: " + truck.calculateFuelEfficiency());


    }
}