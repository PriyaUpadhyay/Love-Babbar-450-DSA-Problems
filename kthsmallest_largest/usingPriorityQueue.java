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
	   // kth smallest num in array
	   //PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
	   
	   //kth largest num in array
	   PriorityQueue<Integer> queue = new PriorityQueue<>();
	   for(int i =0;i<n;i++){
	       queue.add(arr[i]);
	       if(queue.size()>k) queue.poll();
	   }
	   System.out.println(queue.peek());
	   
	}
}
