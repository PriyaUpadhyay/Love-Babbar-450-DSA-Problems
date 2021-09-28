import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int k = sc.nextInt();
	   int n = sc.nextInt();
	   int[] arr = new int[n];
	   for(int i =0;i<n;i++) arr[i] = sc.nextInt();
	   Arrays.sort(arr); //ascending order
	   for(int value:arr) System.out.print(value+" ");
	   System.out.println(k+"nd largest "+arr[n-k]);
	   System.out.println(k+"nd smallest "+arr[k-1]);
	}
}
