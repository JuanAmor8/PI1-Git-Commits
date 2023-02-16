public class Car {

    private final boolean wheels;
    private final int cylinders;

    public Car(boolean wheels, int cylinders) {
        this.wheels = wheels;
        this.cylinders = cylinders;
    }
<<<<<<< HEAD
=======

    public boolean isWheels() {
        return wheels;
    }

    public void setWheels(boolean wheels) {
        this.wheels = wheels;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "Wheels: " + wheels + "cylinders: " + cylinders + "\n";
    }
>>>>>>> 7e7e5cd (add cars toString and print)
}
