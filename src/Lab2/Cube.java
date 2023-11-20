package Lab2;

class Cube {

    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    public Cube() {
    }

    int moreCube (int k){
        int area = (int)sideLength * (int)sideLength * k;
        return area;
    }
    double calculateArea() {
        return sideLength * sideLength;
    }
    double calculateVolume(){
        return calculateArea() * sideLength;
    }
    double getSideLength() {
        return sideLength;
    }

    void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }


}