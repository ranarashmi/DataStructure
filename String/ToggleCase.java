import java.io.*;
import java.util.*;

public class Main {
    
    public static String toggleCase(String str){
        String s="";
        for(int i=0; i<str.length(); i++){
           char c = str.charAt(i);
           if(c>='a' && c<='z'){
               s +=(char)('A'+ c -'a');
           }else{
               s += (char)('a'+c-'A');
           }
        }
        
        return s;
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(toggleCase(str));
    }

}