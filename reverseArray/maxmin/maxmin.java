import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i =0;i<n;i++) arr[i] = sc.nextInt();
	    MINMAX minmax = getMinMax(arr, 0, n-1);
	    System.out.println("min:"+minmax.min +" max: "+minmax.max);
	    
	}
	static MINMAX getMinMax(int arr[] , int low , int high){
    MINMAX minmax = new MINMAX();
    MINMAX left = new MINMAX();
    MINMAX right = new MINMAX();
    int mid;
    if(low==high){
        minmax.max = arr[low];
        minmax.min = arr[low];
        return minmax;
    }
    if(high == low+1){
        if(arr[low]>arr[high]){
            minmax.max = arr[low];
            minmax.min = arr[high];
        }else{
            minmax.max = arr[high];
            minmax.min = arr[low];
        }
        return minmax;
    }
    
    mid = (low+high)/2;
    left = getMinMax(arr, low,mid);
    right = getMinMax(arr, mid+1,high);
    
    if(left.min<right.min){
        minmax.min = left.min;
    }else {
        minmax.max = right.min;
    }
    
    if(right.max >left.max) minmax.max = right.max;
    else minmax.max = left.max;
    
    return minmax;
}

}
class MINMAX{
    int min;
    int max;
}
