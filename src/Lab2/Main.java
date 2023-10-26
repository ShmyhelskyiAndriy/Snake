package Lab2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 4);
        Cube cube = new Cube(6);
        Rectangle rectVol = new Rectangle(3, 4,5);

        System.out.println("Площа кола: " + circle.calculateArea());
        System.out.println("Площа кола: " + circle.calculateArea(180));
        System.out.println("Площа прямокутника: " + rectangle.calculateArea());
        System.out.println("Об'єм прямокутника: " + rectangle.calculateVolume());
        System.out.println("Об'єм прямокутника: " + rectangle.calculateVolume(3));
        System.out.println("Площа квадрата: " + cube.calculateArea());
        System.out.println("Площа квадратів: " + cube.moreCube(3));
        System.out.println("Об'єм куба: " + cube.calculateVolume());
        System.out.println("Об'єм куба: " + rectVol.calculateVolume());
    }
}