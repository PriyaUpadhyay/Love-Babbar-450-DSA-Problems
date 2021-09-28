import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int t = sc.nextInt();
	   while(t-->=0){
	       String str = sc.nextLine();
	       System.out.println(reverse(str));
	   }
	}
	static String reverse(String str){
	    int n = str.length();
	    if(n==0) return "";
	    return (str.charAt(n-1)+reverse(str.substring(0,n-1)));
	}
}
