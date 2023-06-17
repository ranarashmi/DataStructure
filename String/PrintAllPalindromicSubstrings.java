import java.io.;
import java.util.;

public class Main {
    
    public static boolean isPalindrome(String str){
        
        String rev=;
        
        for(int i=0; istr.length(); i++){
            rev = str.charAt(i) + rev;
        }
         if(rev.equals(str)){
                 return true;
             }
        return false;
    }

    public static void main(String[] args) throws Exception {
         write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        for(int i=0; istr.length(); i++){
            for(int j=i+1; jstr.length(); j++){
                String s = str.substring(i,j);
                
                if(isPalindrome(s) == true){
                    System.out.println(s);
                }
            }
        }
        
    }

}