package Lab2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cube cube = new Cube();
        Rectangle rect = new Rectangle();

        circle.setRadius(4);
        cube.setLength(5);
        rect.setHeight(5);
        rect.setWidth(4);
        rect.setLength(4);

        double cubArea = cube.test();
        System.out.println("Площа куба: " + cubArea);

        System.out.println("Статичний метод для площі кола: " + Circle.statSquare());

        System.out.println("Об'єм прямокутника: " + rect.demoCalVol(3));
        double circleArea = Dispatcher.calculateArea(circle);
        System.out.println("Площа кола: " + circleArea);

        double rectangleArea = Dispatcher.calculateArea(rect);
        System.out.println("Площа прямокутника: " + rectangleArea);

        double circleVolume = Dispatcher.calculateVolume(circle);
        System.out.println("Об'єм куба: " + circleVolume);

        double rectVolume = Dispatcher.calculateVolume(rect);
        System.out.println("Об'єм куба: " + rectVolume);
    }
}