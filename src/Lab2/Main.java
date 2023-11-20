package Lab2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cube cube = new Cube();
        Rectangle rect = new Rectangle();

        circle.setRadius(4);
        cube.setSideLength(5);
        rect.setHeight(5);

        System.out.println("Статичний метод для площі кола: " + Circle.statSquare());

        System.out.println("Об'єм прямокутника: " + rect.demoCalVol(3));

        System.out.println("Площа кола: " + circle.calculateArea());
        System.out.println("Площа кола: " + circle.calculateArea(180));
        System.out.println("Площа прямокутника: " + rect.calculateArea());
        System.out.println("Площа квадрата: " + cube.calculateArea());
        System.out.println("Площа квадратів: " + cube.moreCube(3));
        System.out.println("Об'єм куба: " + cube.calculateVolume());
    }
}