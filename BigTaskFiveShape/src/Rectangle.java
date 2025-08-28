public class Rectangle implements Shape {

    private final int a;
    private final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculateArea() {
        return (a * b);
    }

    @Override
    public String getType() {
        return "Rectangle";
    }
}
