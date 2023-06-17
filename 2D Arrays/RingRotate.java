import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        int arr[][] = new int[n][m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
              arr[i][j] = sc.nextInt();
            }
        }
        
        int s = sc.nextInt();
        int r = sc.nextInt();
        
        rotateShell(arr,s,r);
        display(arr);
    }
    
    public static void rotateShell(int[][] arr,int s, int r){
        int[] oneDir = fillArrayFromShell(arr,s);
        rotate(oneDir,r);
        fillShellFromArray(arr,s,oneDir);
    }
    
    public static int[] fillArrayFromShell(int[][] arr, int s){
        
        int minRow= s-1;
        int minCol = s-1; 
        int maxRow = arr.length-s;
        int maxCol = arr[0].length-s;
        int total = 2 * (maxRow-minRow+maxCol-minCol);
        
        int[] oneDir = new int[total];
        int index=0;
        
        //lw
        
        for(int i=minRow, j=minCol; i<=maxRow;i++){
            oneDir[index] = arr[i][j];
            index++;
        }
        minCol++;
        
        //bw
        for(int i=maxRow, j= minCol; j<=maxCol; j++){
            oneDir[index] = arr[i][j];
            index++;
        }
        maxRow--;
        
        //rw
        for(int i=maxRow, j=maxCol; i>=minRow; i--){
            oneDir[index] = arr[i][j];
            index++;
        }
        maxCol--;
        
        //tw
        for(int i=minRow, j=maxCol; j>=minCol; j--){
            oneDir[index] = arr[i][j];
            index++;
        }
        minRow++;
        
        return oneDir;
        
        
    }
    
    public static void fillShellFromArray(int[][] arr, int s,int[] oneDir){
        int minRow= s-1;
        int minCol = s-1; 
        int maxRow = arr.length-s;
        int maxCol = arr[0].length-s;
        
        int index=0;
        
        //lw
        
        for(int i=minRow, j=minCol; i<=maxRow;i++){
            arr[i][j]= oneDir[index];
            index++;
        }
        minCol++;
        
        //bw
        for(int i=maxRow, j= minCol; j<=maxCol; j++){
           arr[i][j]= oneDir[index];
            index++;
        }
        maxRow--;
        
        //rw
        for(int i=maxRow, j=maxCol; i>=minRow; i--){
            arr[i][j]= oneDir[index];
            index++;
        }
        maxCol--;
        
        //tw
        for(int i=minRow, j=maxCol; j>=minCol; j--){
           arr[i][j]= oneDir[index];
            index++;
        }
        minRow++;
    }
    
    public static void reverse(int oneDir[] , int start, int end){
        
        while(start<=end){
            int temp = oneDir[start];
            oneDir[start]= oneDir[end];
            oneDir[end] = temp;
            
            start++;
            end--;
        }
    }
    
    public static void rotate(int[] oneDir,int r){
       r = r % oneDir.length;
       
       if(r<0){
           r += oneDir.length;
       }
       
       reverse(oneDir,0,oneDir.length-r-1);
       reverse(oneDir,oneDir.length-r,oneDir.length-1);
       reverse(oneDir,0,oneDir.length-1);
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