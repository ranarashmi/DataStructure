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
    
    for(int i=0; i<arr[0].length;i++){
        if(i%2 == 0){
            for(int j=0; j<arr.length; j++){
                System.out.println(arr[j][i]+" ");
            }
        }else{
            for(int j=arr.length-1; j>=0; j--){
                System.out.println(arr[j][i]+" ");
            }
        }
    }
    
   }
  }