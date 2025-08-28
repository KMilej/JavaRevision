public class Triangle implements Shape {

    private final int a;
    private final int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getType() {
        return "Triangle";
    }

    @Override
    public int calculateArea() {
        return (a * h) / 2;
    }
}
