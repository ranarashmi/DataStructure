import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int arr[][] = new int[r][r];
        
        for(int i=0; i<r; i++){
            for(int j=0; j<r; j++){
              arr[i][j] = sc.nextInt();
            }
        }
        rotateby90(arr);
        display(arr);
    }
    
    public static void rotateby90(int[][] arr){
        
        //transpose
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
        //reverse each row
        for(int i=0; i<arr.length; i++){
            int start = 0;
            int end= arr[0].length-1;
            while(start<=end){
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                
                start++;
                end--;
            }
        }
    }
    
     public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}