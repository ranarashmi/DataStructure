import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  int n= sc.nextInt();
  

  
  for(int i=0; i<n; i++){
      int combij= 1;
      for(int j=0; j<=i; j++){
          System.out.print(combij+"\t");
          combij = (combij *(i-j)/ (j+1));
      }
      System.out.println();
  }
 }
}