import java.io.*;
import java.util.*;

public class SpanOfArray{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;;
    
    for(int i=0; i<n; i++){
        int num = sc.nextInt();
        if(num > max){
            max = num;
        }
        
        if(num < min){
            min = num;
        }
    }
    
    System.out.println(max-min);
 }

}

