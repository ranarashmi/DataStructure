import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner sc = new Scanner(System.in);
    int r1= sc.nextInt();
    int c1 = sc.nextInt();
    
    int arr[][] = new int[r1][c1];
    
     for(int i=0; i<r1; i++){
        for(int j=0; j<c1; j++){
         arr[i][j] = sc.nextInt();
        }
    }
    
    int minRow=0;
    int minCol = 0;
    int maxRow =arr.length-1;
    int maxCol = arr[0].length-1;
    
    int total = r1*c1;
    int count=0;
    
    while(count<total){
        //lwall
        for(int i=minRow, j=minCol; i<=maxRow && count<total; i++){
            System.out.println(arr[i][j]);
            count++;
        }
        minCol++;
        
        //bwall
        
        for(int i=maxRow , j=minCol; j<=maxCol && count<total; j++){
            System.out.println(arr[i][j]);
            count++;
        }
        maxRow--;
        
        //rwall
        
        for(int i=maxRow, j = maxCol; i>=minRow && count<total; i--){
            System.out.println(arr[i][j]);
            count++;
        }
        maxCol--;
        
        //twall
        
        for(int i=minRow, j=maxCol; j>=minCol && count<total; j--){
            System.out.println(arr[i][j]);
            count++;
        }
        minRow++;
    }
   }
  }