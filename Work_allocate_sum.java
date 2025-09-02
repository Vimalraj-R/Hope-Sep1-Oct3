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




// Another approach

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        char[] jobs=new char[N];
        int[] dl = new int[N];
        int[] p = new int[N];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<N; i++)
        {
            char[i]=sc.next()
            dl[i] = sc.nextInt();
            p[i] = sc.nextInt();
            if(dl[i]>max){
                max=dl[i];
            }
        }
        for(int i=0; i<N; i++)
        {
            for(int j=i+1; j<N; j++)
            {
                if(p[i]<p[j]){
                    int t = p[i];
                    p[i] = p[j];
                    p[j] = t;
                    
                    t = dl[i];
                    dl[i] = dl[j];
                    dl[j] = t;
                }
            }
        }
        int[] ans = new int[max+1];
        for(int i=0; i<N; i++)
        {
            for(int j=dl[i]; j>0; j--)
            {
               if(ans[j]==0){
                   ans[j]=p[i];
                   break;
               }
            }
        }
        int ns=0;
        for(int i=0; i<max+1; i++)
        {
            ns+=ans[i];
        }
        System.out.println(ns);
    }
}
