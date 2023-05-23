import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    
    int d = sc.nextInt();
    
    int sIndex=-1;
    int low=0, high= arr.length-1;
    
    while(low<=high){
       int mid = (low+high)/2;
        
        if(arr[mid] < d){
            low = mid+1;
        }else if(arr[mid] > d){
            high = mid-1;
        }else{
            sIndex = mid;
            high = mid-1;
        }
    }
    
    
    low =0;
    high = arr.length-1;
    int lIndex = -1;
    
    while(low<=high){
         int mid = (low+high)/2;
        
        if(arr[mid] < d){
            low = mid+1;
        }else if(arr[mid] > d){
            high = mid-1;
        }else{
            lIndex = mid;
            low = mid+1;
        }
    }
    
    
    System.out.println(sIndex);
    System.out.println(lIndex);
    
 }

}