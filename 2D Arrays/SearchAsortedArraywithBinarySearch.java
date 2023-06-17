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
        
        int k = sc.nextInt();
        
        int r=0, c=n-1;
        
        while(r<n && c>=0){
            if(arr[r][c] == k){
                System.out.println(r+"\n"+c);
                return;
            }
            
            if(arr[r][c]>k){
                c--;
            }else{
                r++;
            }
        }
        
        System.out.println("Not Found");
    }

}