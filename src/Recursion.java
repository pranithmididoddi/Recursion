public class Recursion {

    public static void main(String[] args){


       Recursion recursion=new Recursion();
        System.out.println(recursion.mincost(0,1));


    }

    /**calculating the minimum cost between the source and destination*/

    public int mincost(int s, int d){

        int[][] cost={{0,15,45,75},{-1,0,20,30},{-1,-1,0,30},{-1,-1,-1,0}};;

        if(s==d || s==d-1) {
            return cost[s][d];
        }
        int minvalue=cost[s][d];

        for(int i=s+1;i<d;i++){
            int temp=mincost(s,i)+mincost(i,d);

            if(temp<minvalue){
                minvalue=temp;
            }
        }

        return minvalue;
    }




}
