import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  int n= sc.nextInt();
  
  for(int i=0; i<=n; i++){
      for(int j=1; j<=n-i; j++){
          System.out.print("*\t");
      }
      System.out.println();
  }
 }
}