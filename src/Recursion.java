public class Recursion {

    public static void main(String[] args){

        Recursion object=new Recursion();

        System.out.println(object.calculatepower(5,3));


    }

    public int calculatepower(int m, int n){
        if(n==0) return 1;
        else if(m==1) return 1;
        else return m*calculatepower(m,n-1);
    }


}
