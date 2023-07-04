import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
       ArrayList<String> sp = getStairPaths(n);
       System.out.println(sp);
       
    }
    
    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }else if(n<0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        
        ArrayList<String> path1 = getStairPaths(n-1);
        ArrayList<String> path2 = getStairPaths(n-2);
        ArrayList<String> path3 = getStairPaths(n-3);
        
        ArrayList<String> paths = new ArrayList<>();
        
        for(String p:path1){
            paths.add(1+p);
        }
        
        for(String p:path2){
            paths.add(2+p);
        }
        
        for(String p:path3){
            paths.add(3+p);
        }
        
        return paths;
    }

	
}
