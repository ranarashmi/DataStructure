import java.io.*;
import java.util.*;

public class Main {
    
    public static String solution(String str){
        String s = ""+ str.charAt(0);
        
        for(int i=1; i<str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            
            int dif = (int)curr - prev;
            s += ""+dif+curr;
        }
        
        return s;
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

}