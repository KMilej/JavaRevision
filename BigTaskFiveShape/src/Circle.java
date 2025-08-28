public class Circle implements Shape {

    private final int r;
    private final double n = 3.14;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public int calculateArea() {
        return (int) (n * (r * r));
    }


    @Override
    public String getType() {
        return "Circle";

    }
}
