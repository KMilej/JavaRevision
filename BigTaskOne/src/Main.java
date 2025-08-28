public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        // wywołanie metody int
        System.out.println("int: " + calculator.add(1, 2));

        // wywołanie metody double
        System.out.println("double: " + calculator.add(1.21, 2.43));

        // wywołanie metody long
        System.out.println("long: " + calculator.add(839403804832904238L, 3403744890374983L));

        // wywołanie metody float
        System.out.println("float: " + calculator.add(3.14f, 2.71f));
    }
}
