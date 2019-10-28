public class Vehicle extends Car{
    private String engineType;
    private int numberOfDoors;
    private int maxPassengers;

    public Vehicle(String engineType, int numberOfDoors, int maxPassengers) {
        super("Left", "Park", 0, 0);
        this.engineType = engineType;
        this.numberOfDoors = numberOfDoors;
        this.maxPassengers = maxPassengers;
    }

    public String getEngineType() {
        System.out.println("This vehicle has a " + engineType + " Engine");
        return engineType; }

    public void setEngineType(String engineType) { this.engineType = engineType; }

    public int getNumberOfDoors() {
        System.out.println("The vehicle has " + numberOfDoors + " doors");
        return numberOfDoors; }

    public void setNumberOfDoors(int numberOfDoors) { this.numberOfDoors = numberOfDoors; }

    public int getMaxPassengers() {
        System.out.println("This car can hold a maximum of " + maxPassengers + " passengers");
        return maxPassengers; }

    public void setMaxPassangers(int maxPassangers) { this.maxPassengers = maxPassangers; }

}
