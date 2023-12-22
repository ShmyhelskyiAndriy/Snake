package Interface;

public class Main{
    public static void main(String[] args) {
        double square = (new Triangle()).getSquare(6);
        double square2 = (new Cube()).getSquare(2);
        double half = (new Cube()).getHalf(5);
        System.out.println(square);
        System.out.println(square2);
        System.out.println(half);
    }
}
