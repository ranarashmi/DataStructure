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
        
        ArrayList<String> paths = new ArrayList<>();
        
        //horizontal paths
        for(int hm=1; hm<= dc-sc; hm++){
            ArrayList<String> hpath = getMazePaths(sr,sc+hm,dr,dc);
            
            for(String h:hpath){
                paths.add("h"+hm+hpath);
            }
        }
        
        //vertical path
        for(int vm=1; vm<= dr-sr; vm++){
            ArrayList<String> vpath = getMazePaths(sr+vm,sc,dr,dc);
            
            for(String v:vpath){
                paths.add("v"+vm+vpath);
            }
        }
        
        //Diagonal path
        for(int dm=1; dm<= dc-sc && dm <= dr-sr; dm++){
            ArrayList<String> dpath = getMazePaths(sr+dm,sc+dm,dr,dc);
            
            for(String d:dpath){
                paths.add("d"+dm+dpath);
            }
        }
        
        
        return paths;
    }
 
	
}
