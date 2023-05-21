import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        
        int res=0, mul=1;
        
        while(n>0){
            int r = n%b;
            n = n/b;
            
            res += r* mul;
            mul = mul * 10;
        }
        
        System.out.println(res);
        
    }
}