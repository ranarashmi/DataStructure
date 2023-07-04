import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String str = br.readLine();
       ArrayList<String> subStr = gss(str);
       System.out.println(subStr);
       
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rrec = gss(ros);
        
        ArrayList<String> frrec = new ArrayList<>();
        
        for(String res: rrec){
            frrec.add(""+res);
            frrec.add(ch+res);
        }
        
        return frrec;
    }

	
}
