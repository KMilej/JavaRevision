public class MaxSpeed {
    private int mileage;
    private final int maxSpeed;
    private int range;

    public MaxSpeed (int mileage, int maxSpeed, int range) {
        this.mileage = mileage;
        this.maxSpeed = maxSpeed;
        this.range = range;
    }
    public void drive(int mileage, int range) {
        this.mileage += mileage;
        this.range -= range;
    }
    public void addFuel(int range) {
        this.range += range;
    }

    @Override
    public String toString() {
        return "MaxSpeed{" +
                "mileage=" + mileage +
                ", maxSpeed=" + maxSpeed +
                ", range=" + range +
                '}';
    }
}
