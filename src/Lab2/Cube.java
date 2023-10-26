package Lab2;

class Cube {
    double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
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

}