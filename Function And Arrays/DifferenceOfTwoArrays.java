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
    
    while(k>=0){
        int dig = 0;
        
        int val1= i>=0?arr1[i]:0;
        if(arr2[j] + carry >=val1){
            dig = arr2[j] + carry - val1;
            carry=0;
        }else{
            dig = arr2[j] + carry + 10 -val1;
            carry = -1;
        }
        
        result[k] = dig;
        i--;
        j--;
        k--;
        
    }
    
    int index=0;
    while(index<result.length){
        if(result[index] == 0){
            index++;
        }else{
            break;
        }
    }
    
    while(index<result.length){
        System.out.println(result[index]);
        index++;
    }
 }

}