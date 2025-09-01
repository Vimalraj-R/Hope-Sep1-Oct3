import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        char[] arr=new char[N];
        int[] police_ind=new int[N];
        int[] theif_ind=new int[N];
        int pol_count=0;
        int the_count=0;
        for(int ind=0;ind<N;ind++){
            arr[ind]=sc.next().charAt(0);
            if(arr[ind]=='P'){
                police_ind[pol_count]=ind;
                pol_count++;
            }
            else{
                theif_ind[the_count]=ind;
                the_count++;
            }
        }
        int k=sc.nextInt();
        int count=0;
        int i=0,j=0;
        while(pol_count>i && the_count>j){
            if(Math.abs(police_ind[i]-theif_ind[j])<=k){
                System.out.println("Police" + police_ind[i] + ":" + "Caught Theif" +theif_ind[j]);
                count++;
                i++;
                j++;
            }
            else if(police_ind[i]<theif_ind[j]){
                i++;
            }
            else{
                j++;
            }
        }
        System.out.println(count);
    }
}
