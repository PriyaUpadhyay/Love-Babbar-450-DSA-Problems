import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    sc.nextLine();
	    while(t-->0){
	        int n = sc.nextInt();sc.nextLine();
	        int[] arr = new int[n];
	        for(int i = 0;i<n;i++){
	            arr[i]= sc.nextInt();
	        }
	        arr = reverseArray(arr);
	        for(int value: arr) System.out.print(value+" ");
	        System.out.println();
	    }
	}
	
	public static int[] reverseArray(int[] arr)
	{
	    int n = arr.length;
	    int l = 0, r = n-1;
	    
	    while(l<r){
	        int temp = arr[l];
	        arr[l++] = arr[r];
	        arr[r--] = temp;
	    }
	    return arr;
	}
}
