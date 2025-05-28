public class Car extends Vehicle {
    private int numberOfSeats;
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void start() {
        System.out.println("Car start");
    }

    @Override
    public void stop() {
        System.out.println("Car stop");
    }
}
