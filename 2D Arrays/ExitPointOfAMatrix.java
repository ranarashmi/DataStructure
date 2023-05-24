import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int dir=0;
        int i=0, j=0;
        
        while(true){
            dir = (dir+arr[i][j])%4;
            if(dir==0){//east
                j++;                
            }else if(dir==1){//south
                i++;
            }else if(dir==2){//west
                j--;
            }else if(dir==3){//north 
                i--;
            }
            
            
         if(i<0){
            i++;
            break;
        }else if(j<0){
            j++;
            break;
        }else if(i==arr.length){
            i--;
            break;
        }else if(j==arr[0].length){
            j--;
            break;
        }
    }
        System.out.print(i + "\n"+j);
    }

}