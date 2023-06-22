import java.io.*;
import java.util.*;

public class Main {
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		System.out.println(power(x,n));
	}
	
	public static int power(int x,int n){
	    if(n==0){
	        return 1;
	    }
        int xem = power(x,n/2);
        int xm = xem * xem;
        
        if(n%2 == 1){
            xm = xm *x;
        }
        
        return xm;
	}
	
}
