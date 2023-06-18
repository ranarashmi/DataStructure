import java.io.*;
import java.util.*;

public class Main {
    
    public static int fact(int n){
      if(n>1){
          return n*fact(n-1);
      }else{
          return 1;
      }
    }
    
    public static void solution(String str){
        int len = str.length();
        int n = fact(len);
        
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder(str);
            int temp =i;
            
            for(int j=len; j>=1; j--){
                int q = temp/j;
                int r= temp%j;
                
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp =q;
            }
            System.out.println();
        }
         
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution(str);
    }

}