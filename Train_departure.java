import java.io.*;
import java.util.*;

public class Solution{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arrival=new int[N];
        int[] depart=new int[N];
        for(int ind=0;ind<N;ind++){
            arrival[ind]=sc.nextInt();
        }
        for(int ind=0;ind<N;ind++){
            depart[ind]=sc.nextInt();
        }
        Arrays.sort(depart);
        int f_p=0;
        int platform=1;
        int i=1;
        int j=0;
        while(N>i && N>j){
            if(arrival[i]<depart[j]){
                platform++;
                i++;
                f_p=Math.max(f_p,platform);
            }
            else if(arrival[i]>depart[j]){
                platform--;
                j++;
                f_p=Math.max(f_p,platform);
            }
        }
        System.out.print(f_p);
    }
}
