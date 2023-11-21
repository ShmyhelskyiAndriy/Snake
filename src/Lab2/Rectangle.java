package Lab2;

class Rectangle extends Figure{
    private double length;
    private double width;
    private double height;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle (double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    double calculateArea() {
        return length * width * 6;
    }
    double calculateCubArea() {
        return length * length * 6;
    }


    public double calculateVolume(){
        return length * width * height;
    }

    private double calculateVolume(double height){
        return length * width * height;
    }

    double demoCalVol(double height) {
        return calculateVolume(height);
    }



    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
       if (height % 2 == 1){
           this.height=height*height;
       }else{
           this.height = height;
       }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
}
