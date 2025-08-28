public class Rectangle {

    /* PROPERTIES */
    private final double sideOne;
    private final double sideTwo;

    /* METHODS - Constructors */
    // Konstruktor dla int
    public Rectangle(int sideOne, int sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    // Konstruktor dla double
    public Rectangle(double sideOne, double sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    // Konstruktor dla kwadratu (int)
    public Rectangle(int side) {
        this.sideOne = side;
        this.sideTwo = side;
    }

    // Konstruktor dla kwadratu (double)
    public Rectangle(double side) {
        this.sideOne = side;
        this.sideTwo = side;
    }

    // Sprawdzenie czy prostokąt to kwadrat
    public boolean isSquare() {
        return Double.compare(sideOne, sideTwo) == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;

        Rectangle r = (Rectangle) o;

        // prostokąt 3x5 == 5x3
        return (Double.compare(sideOne, r.sideOne) == 0 && Double.compare(sideTwo, r.sideTwo) == 0)
                || (Double.compare(sideOne, r.sideTwo) == 0 && Double.compare(sideTwo, r.sideOne) == 0);
    }

    @Override
    public int hashCode() {
        // użyj mniejszych i większych boków, aby zachować symetrię
        double min = Math.min(sideOne, sideTwo);
        double max = Math.max(sideOne, sideTwo);

        int result = Double.hashCode(min);
        result = 31 * result + Double.hashCode(max);
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideOne=" + sideOne +
                ", sideTwo=" + sideTwo +
                ", isSquare=" + isSquare() +
                '}';
    }
}
