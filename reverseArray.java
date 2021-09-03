import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++){
		    arr[i]=sc.nextInt();
		    
		}
		arr = reverseArr(arr);
		for(int value:arr) System.out.print(value+" ");
		
	}
	public static int[] reverseArr(int[] arr){
	    int len = arr.length;
	    int ref = len-1;
	    
	        for(int i =0;i<len/2;i++){
	            int temp = arr[i];
	            arr[i]=arr[ref];
	            arr[ref--]=temp;
	        }
	        return arr;
	}
}
