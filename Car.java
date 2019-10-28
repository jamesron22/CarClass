public class Car {
    private String steering;
    private String gear;
    private int speed;
    private int increaseSpeed;

    public Car(String steering, String gear, int speed, int increaseSpeed) {
        this.steering = steering;
        this.gear = gear;
        this.speed = speed;
        this.increaseSpeed = increaseSpeed;
    }

    public String getSteering() {
            System.out.println("The vehicle is turning " + steering);
            return this.steering; }

    public void setSteering(String steering) { this.steering = steering; }

    public String getGear() {
        System.out.println("The vehicle is in " + gear);
        return gear; }

    public void setGear(String gear) { this.gear = gear; }

    public int getSpeed() {
        System.out.println("Speed is " + speed + " MPH");
        return speed; }

    public void setSpeed(int speed) { this.speed = speed; }

    public void setIncreaseSpeed(int increaseSpeed) {
        this.speed += increaseSpeed;
    }
}
