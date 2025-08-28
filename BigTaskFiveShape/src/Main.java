/*
Stwórz interfejs Shape, w którym zdefiniujesz metody getType() oraz calculateArea(). Stwórz klasy Rectangle, Circle oraz Triangle implementujące interfejs Shape.
Metoda getType() powinna zwracać typ figury (prostokąt, okrąg, trójkąt), metoda calculateArea() powinna zwracać pole figury.
*/

public class Main {
    public static void main(String[] args) {

        System.out.println("Circle");
        Circle circle = new Circle(4);
        System.out.println(circle.getType());
        System.out.println(circle.calculateArea());


        System.out.println("Rectangle");
        Rectangle rectangle = new Rectangle(2,10);
        System.out.println(rectangle.getType());
        System.out.println(rectangle.calculateArea());

        System.out.println("Triangle");
        Triangle triangle = new Triangle(4, 8);
        System.out.println(triangle.getType());
        System.out.println(triangle.calculateArea());



    }
}