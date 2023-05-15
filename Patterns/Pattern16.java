import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  int n= sc.nextInt();
  int st = 1;
  int sp=(2*n)-3;
  for(int i=1; i<=n; i++){
      int val =1;
          for(int k=1; k<=st; k++){
              System.out.print(val+"\t");
              val++;
          }
          
          for(int k=1; k<=sp ; k++){
              System.out.print("\t");
          }
          
          val = i<n? val-1:val-2;
          st = i<n? st : st-1;
          for(int k=1; k<=st; k++){
              System.out.print(val+"\t");
              val--;
          }
          
          st++;
          sp -=2;
          
        System.out.println();
      }
 }
}