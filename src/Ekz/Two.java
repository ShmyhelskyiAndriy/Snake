package Ekz;

public class Two extends One{
    int j;
    public Two(int j){
        this.j=j;
    }
  
    int sum(){
        int sum = super.j + j;
        return sum;
    }
}
