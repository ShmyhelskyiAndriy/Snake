package Lab2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cube cube = new Cube();
        Rectangle rect = new Rectangle();

        circle.setRadius(4);
        cube.setSideLength(5);
        rect.setHeight(5);

        cube.test();

        System.out.println("Статичний метод для площі кола: " + Circle.statSquare());

        System.out.println("Об'єм прямокутника: " + rect.demoCalVol(3));
        double circleArea = Dispatcher.calculateArea(circle);
        System.out.println("Площа кола: " + circleArea);

        // Виклик методу calculateArea() для об'єкта rectangle
        double rectangleArea = Dispatcher.calculateArea(rect);
        System.out.println("Площа прямокутника: " + rectangleArea);

        // Виклик методу calculateArea() для об'єкта cube
        double cubeArea = Dispatcher.calculateArea(cube);
        System.out.println("Площа куба: " + cubeArea);

        // Виклик методу calculateVolume() для об'єкта cube
        double cubeVolume = Dispatcher.calculateVolume(cube);
        System.out.println("Об'єм куба: " + cubeVolume);
    }
}