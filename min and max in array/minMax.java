// min and max value using sorting
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int size = sc.nextInt ();
    int arr[] = new int[size];
    for (int i = 0; i < size; i++)
        arr[i] = sc.nextInt ();
    int[] result = minMax (arr);
      System.out.println ("\nmin value is " + result[0] + " max value is " +
			  result[1]);

  }
  public static int[] minMax (int[]arr)
  {
    for (int i = 0; i < arr.length - 1; i++)
      {
	for (int j = i + 1; j < arr.length; j++)
	  {
	    if (arr[i] > arr[j])
	      {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	      }
	  }
      }
  for (int value:arr)
      System.out.print (value + " ");
    int[] result = new int[2];
    result[0] = arr[0];
    result[1] = arr[arr.length - 1];
    return result;

  }

}
