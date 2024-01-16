package Lab2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cube cube = new Cube();
        Rectangle rect = new Rectangle();
        Dispatcher disp = new Dispatcher();

        circle.setRadius(4);
        cube.setLength(5);
        rect.setHeight(5);
        rect.setWidth(4);
        rect.setLength(4);

        double cubArea = cube.test();
        System.out.println("Площа куба: " + cubArea);

        System.out.println("Статичний метод для площі кола: " + Circle.statSquare());

        System.out.println("Об'єм прямокутника: " + rect.demoCalVol(3));
        disp.menu(1);
        disp.menu(3);
    }
}