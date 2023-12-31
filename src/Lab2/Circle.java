package Lab2;

class Circle extends Figure{
    static double square = 50;
    static double statRadius;
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateVolume() {
        return 7;
    }

    double calculateArea(double degrees){
        return Math.PI * radius * radius * (degrees / 360);
    }
    static {statRadius = Math.sqrt(square / (4 * Math.PI));}
    static double statSquare() {
        double s;
        s = Math.PI * Math.pow(statRadius, 2);
        return s;
    }

    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }


}
