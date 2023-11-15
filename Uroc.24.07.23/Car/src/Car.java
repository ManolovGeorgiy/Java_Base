public class Car {

    public int numberOfWheels = 4;

    public Car() {
        System.out.println("Машина создана!");
    }

    public Car(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;

        System.out.println("Машина создана, у неё: " + numberOfWheels + " колёс!" + this);
    }
}
