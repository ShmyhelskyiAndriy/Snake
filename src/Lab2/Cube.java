package Lab2;

class Cube extends Rectangle {

    private double length;


    public Cube(double length) {
        this.length = length;
    }

    public Cube() {
    }

    int moreCube (int k){
        int area = (int)length * (int)length * k;
        return area;
    }
    double calculateCubeArea() {
        return calculateCubArea();
    }
    double test () {
        CubeArea cb = new CubeArea();
        return cb.calCube();
    }
    class CubeArea{
        double calCube (){
            System.out.println("метод вкладеного класу");
            return calculateCubeArea();
        }
    }
    double calculateCubeVolume(){
        return calculateCubArea() /6 * length;
    }
    double getSideLength() {
        return length;
    }




}