import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] deadline=new int[N];
        int[] profit=new int[N];
        for(int ind=0;ind<N;ind++){
            deadline[ind]=sc.nextInt();
            profit[ind]=sc.nextInt();
        }
        boolean[] job=new boolean[N+1];
        int total=0;
        for(int ind=0;ind<N;ind++){
            int maxProf=0;
            int index=0;
            for(int i=0;i<N;i++){
                if(profit[i]>maxProf){
                    maxProf=profit[i];
                    index=i;
                }
            }
            for(int j=deadline[index];j>=1;j--){
                if(!job[j]){
                    job[j]=true;
                    total+=profit[index];
                    break;
                }
            }
            profit[index]=-1;
        }
        System.out.print(total);
    }
}
