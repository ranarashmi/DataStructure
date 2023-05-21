import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int arr1[] = new int[n1];
    
    for(int i=0; i<n1; i++){
        arr1[i] = sc.nextInt();
    }
    
    int n2 = sc.nextInt();
    int arr2[] = new int[n2];
    
    for(int i=0; i<n2; i++){
        arr2[i] = sc.nextInt();
    }
    
    int carry =0;
    int result[] = new int[n1>n2?n1:n2];
    int i= arr1.length-1;
    int j= arr2.length-1;
    int k= result.length-1;
    
    while(i>=0 || j>=0){
        int dig = carry;
        
        if(i>=0){
            dig += arr1[i];
        }
        
        if(j>=0){
            dig += arr2[j];
        }
        
        carry = dig/10;
        dig = dig%10;
        result[k] = dig;
        
        i--;
        j--;
        k--;
    }
    
    
    if(carry ==1){
        System.out.println(carry);
    }
    
    
    for(int z=0; z<result.length; z++){
        System.out.println(result[z]);
    }
 }

}