import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int i=start; i<end; i++){
            int n=2;

            while(n*n <=i){
                if(i%n ==0 ){
                    break;
                }
                n++;
            }

            if(n*n > i){
                System.out.println(i);
            }

        }

    }
}