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
    
    int low =0, high = arr.length-1;
    int ceil= Integer.MAX_VALUE;
    int floor = Integer.MIN_VALUE;
    
    while(low<=high){
        int mid = (low+high)/2;
        
        if(arr[mid]<d){
            low = mid+1;
            floor = arr[mid];
        }else if(arr[mid]>d){
            high = mid-1;
            ceil = arr[mid];
        }else{
            ceil = floor = arr[mid];
            break;
        }
    }
    System.out.println(ceil);
    System.out.println(floor);
 }

}