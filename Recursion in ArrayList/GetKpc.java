import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String str = br.readLine();
       ArrayList<String> kpc = getKPC(str);
       System.out.println(kpc);
       
    }
    
    static String kpsStr[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> frres = new ArrayList<>();
        int n = ch - '0';
        String sub = kpsStr[n];
        for(int i=0; i<sub.length(); i++){
            char chcode = sub.charAt(i);
            for(String rstr: rres){
                frres.add(chcode+rstr);
            }
        }
        
        return frres;
    }

	
}
