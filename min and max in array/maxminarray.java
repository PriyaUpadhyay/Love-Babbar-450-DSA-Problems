import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int[] arr = new int[n];
	   for(int i =0;i<n;i++)  arr[i] = sc.nextInt();
	   int min, max;
	   int i;
	   
	   if(n%2==0){
	       i=2;
	       
	       if(arr[0]<arr[1]){
	           min = arr[0];
	           max= arr[1];
	       }
	       else {
	           min = arr[1];
	           max= arr[0];
	       }
	   }else{
	       i=1;
	       min = max = arr[0];
	   }
	   for(;i<n;i=i+2){
	       int mmax,mmin;
	       if(arr[i]>arr[i+1]){
	           mmax = arr[i];
	           mmin = arr[i+1];
	       }else{
	           mmin = arr[i];
	           mmax= arr[i+1];
	       }
	       if(mmax>max) max = mmax;
	       if(mmin<min) min = mmin;
	   }
	   System.out.println("maximum "+max+" minimum "+min);
	   
	       
	   
	}
}
