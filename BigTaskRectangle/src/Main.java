public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(10, 5);
        Rectangle r3 = new Rectangle(5);

        System.out.println("r1.equals(r2): " + r1.equals(r2)); // true
        System.out.println("r1.equals(r3): " + r1.equals(r3)); // false
        System.out.println("r3 is square: " + r3.isSquare());  // true
        System.out.println(r3);
        System.out.println();
        System.out.println(Double.compare(1, 1) == 0);
    }
}
