package Interface;

public class Cube implements Interface2 {
    double a;
    @Override
    public double getSquare(double a) {
        return a*a;
    }
    public double getPerimeter(double a){
        return a+a+a;
    }
    public double getVolume(double a){
        return a*a*a;
    }
    public double getHalf(double a){
        return (a*a*a)/2;
    }
}