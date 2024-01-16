package Ekz;

public class Main {
    public static void main(String[] args) {
      
        Factorial fac = new Factorial();

        One one = new  One();
        Two two = new Two(12);
        System.out.println("Факторіал = " + fac.factorial(5));
        System.out.println("Сума = " + two.sum());
    }
}
