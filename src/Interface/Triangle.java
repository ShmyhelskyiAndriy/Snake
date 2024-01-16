package Interface;

public class Triangle implements Interface1{
    public double getSquare(double a) {
        return (a*a)/2;
    }
    public double getPerimeter(double a){
        return a+a+a;
    }
}
