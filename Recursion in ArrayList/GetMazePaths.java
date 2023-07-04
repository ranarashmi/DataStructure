import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
       int m = Integer.parseInt(br.readLine());
       ArrayList<String> mp = getMazePaths(1,1,n,m);
       System.out.println(mp);
       
    }
    
    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr==dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        
        ArrayList<String> hPath = new ArrayList<>();
        ArrayList<String> vPath = new ArrayList<>();
        
        if(sc<dc){
            hPath=getMazePaths(sr,sc+1,dr,dc);
        }
        
        if(sr<dr){
            vPath = getMazePaths(sr+1,sc,dr,dc);
        }
        
        ArrayList<String> paths = new ArrayList<>();
        
        for(String p:hPath){
            paths.add("h"+p);
        }
        
        for(String p:vPath){
            paths.add("v"+p);
        }
        
        return paths;
    }

	
}
