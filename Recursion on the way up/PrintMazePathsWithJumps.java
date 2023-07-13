import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
       int m = Integer.parseInt(br.readLine());
       printMazePaths(1,1,n,m,"");
    }
    
     // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
	        
	        if(sr>dr || sc>dc){
	            return;
	        }else if(sr==dr && sc==dc){
	            System.out.println(psf);
	            return;
	        }
	        
	        
	        for(int i=1; i<= dc-sc; i++){
	            printMazePaths(sr,sc+i,dr,dc,psf+"h"+i);
	        }
	        
	        for(int i=1; i<= dr-sr; i++){
	            printMazePaths(sr+i,sc,dr,dc,psf+"v"+i);
	        }
	        
	        for(int i=1; i<= dc-sc && i<= dr-sr; i++){
	            printMazePaths(sr+i,sc+i,dr,dc,psf+"d"+i);
	        }
	        
	    }
 
	
}
