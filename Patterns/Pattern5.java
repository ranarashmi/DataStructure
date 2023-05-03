import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  int n= sc.nextInt();
  
  int st = 1, sp =n/2;
  
  for(int i=1; i<=n; i++){
      for(int j=1; j<=sp; j++){
          System.out.print("\t");
      }
      
      for(int j=1;j<=st;j++){
          System.out.print("*\t");
      }
      
      if(i<=n/2){
          st +=2;
          sp--;
      }else{
          st -=2;
          sp++;
      }
      System.out.println();
  }
 }
}