import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        
        int count=0;
        
        while(n>0){
            int r = n%10;
            if(r == d){
                count++;
            }
            n = n/10;
        }
        
        System.out.println(count);
    }
}