package Lab2;

class Rectangle {
    double length;
    double width;
    double height;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle (double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return length * width;
    }
    public double calculateVolume(){
        return length * width * height;
    }
    public double calculateVolume(double height){
        return length * width * height;
    }
}
