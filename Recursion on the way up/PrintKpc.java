import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String str = br.readLine();
       printKPC(str,"");
    }
    
    static String kpsStr[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
     
    public static void printKPC(String str, String asf) {
        
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        String fs = kpsStr[ch - '0'];
        
        for(int i=0; i<fs.length(); i++){
            printKPC(ros,asf+fs.charAt(i));
        }
    }
 
	
}
