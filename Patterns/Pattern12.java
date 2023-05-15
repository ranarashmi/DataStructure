import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  int n= sc.nextInt();
  
  int first =0, sec=1;
  
  for(int i=0; i<n; i++){
      for(int j=0; j<=i; j++){
          System.out.print(first+"\t");
          int count = first+sec;
          first=sec;
          sec=count;
      }
      System.out.println();
  }
 }
}