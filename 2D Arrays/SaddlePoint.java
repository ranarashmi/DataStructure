import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
       for(int i=0; i<n; i++){
           int svj=0;
           for(int j=0; j<n; j++){
               if(arr[i][j] < arr[i][svj]){
                   svj=j;
               }
           }
           
           boolean flag = true;
           for(int k=0; k<arr.length; k++){
              if(arr[k][svj] > arr[i][svj]){
                  flag=false;
                  break;
              }
           }
           
           if(flag){
               System.out.println(arr[i][svj]);
               return;
           }
       }
       
       System.out.println("Invalid inp");
        
    }

}