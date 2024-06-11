public class Car extends Vehicle {
        private double milesDriven;
        private double fuelConsumed;
        public Car(String make, String model, int year, double milesDriven, double fuelConsumed) {
            super(make, model, year);
            this.milesDriven = milesDriven;
            this.fuelConsumed = fuelConsumed;
        }

    public double getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(double milesDriven) {
        this.milesDriven = milesDriven;
    }

    public double getFuelConsumed() {
        return fuelConsumed;
    }

    public void setFuelConsumed(double fuelConsumed) {
        this.fuelConsumed = fuelConsumed;
    }

    @Override
        public double calculateFuelEfficiency() {
            return milesDriven / fuelConsumed;
        }

}
