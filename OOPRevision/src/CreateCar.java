public class CreateCar {
    private String make;
    private String model;
    private final int productionYear;
    private String color;
    private final int maxSpeed;
    private int range;

    public CreateCar(String make, String model, int productionYear, String color, int maxSpeed, int range) {
        this.make = make;
        this.model = model;
        this.productionYear = productionYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.range = range;
    }


    public void setRange(int range) {
        this.range = range;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getRange() {
        return range;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public void drive(int distance) {
        if (distance > range) {
            System.out.println("you dont have enought fuel");
        } else {
            this.range -= distance;
            System.out.println("you drove " + distance + " km");
        }
    }

    public void addFuel(int addFuel) {
        if (400 < range + addFuel) {
            System.out.println("too many fuel, it reach maximum value");
        } else {
            this.range += addFuel;
        }
    }

    @Override
    public String toString() {
        return "CreateCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", range=" + range +
                '}';
    }
}
