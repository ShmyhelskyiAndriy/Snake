package Lab2;

class Cube extends Rectangle {

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
    double calculateCubeArea() {
        return calculateArea();
    }
    void test () {
        CubeArea fd = new CubeArea();
        fd.calCube();
    }
    class CubeArea{
        void calCube (){
            System.out.println("метод вкладеного класу");
            calculateCubeArea();
        }
    }
    double calculateCubeVolume(){
        return calculateArea() * sideLength;
    }
    double getSideLength() {
        return sideLength;
    }

    void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }


}