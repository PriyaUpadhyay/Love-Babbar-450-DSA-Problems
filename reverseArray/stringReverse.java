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
		    String str = sc.nextLine();
		    System.out.println(reverse(str));
		}
	}
	static String reverse(String str){
	    int n = str.length();
	    if(n==0) return "";
	    
	    int l = 0,r = n-1;
	    char[] ch = str.toCharArray();
	    while(l<r){
	        char temp = ch[l];
	        ch[l++] = ch[r];
	        ch[r--] = temp;
	        
	    }
	    return new String(ch);
	}
}

