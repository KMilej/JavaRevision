public class Task8 {
    public void task8() {
        String name = "Kamil";
        System.out.println(name.startsWith("K") && name.endsWith("a"));
        System.out.println(name.startsWith("K") || name.endsWith("a"));

        int a = 5;
        int b = 10;

        System.out.println(a < b && b < 15 && a < 5);
        System.out.println(!(a < b));   //reverse
    }
}
