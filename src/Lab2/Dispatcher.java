package Lab2;

public class Dispatcher {
    Circle circle = new Circle(4);
    Cube cube = new Cube(circle.getRadius());
    Rectangle rect = new Rectangle(circle.getRadius(),3);
    void menu(int number) {
        if (number == 1) {
            System.out.println(circle.calculateArea());
        } else if (number == 2) {
            System.out.println(cube.calculateArea());
        } else if (number == 3) {
            System.out.println("menu");
            System.out.println(rect.calculateArea());
        }
    }
}
