// max and min of Array
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0;i<size;i++) arr[i]=sc.nextInt();
		
		int max = arr[0] ,min = arr[0];
		for(int value: arr){
		    if(max<value) max = value;
		    if(min>value) min = value;
		}
		System.out.println("max value:"+max+"\nmin value is:"+min);
		
	}
}

