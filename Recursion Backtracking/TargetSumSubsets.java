import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        
        printTargetSumSubsets(arr,0,"",0,tar);
    }
    
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        
        if(idx==arr.length){
            if(sos == tar){
             System.out.println(set+".");
        }
        return;
        }
        
        printTargetSumSubsets(arr,idx+1,set+arr[idx]+",",sos+arr[idx],tar);
        printTargetSumSubsets(arr,idx+1,set,sos,tar);
        
    }
}
