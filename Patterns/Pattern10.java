import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  int n= sc.nextInt();
  
  int isp= -1, osp = n/2;
  
  for(int i=0; i<n; i++){
      for(int j=0;j<osp;j++){
          System.out.print("\t");
      }
      System.out.print("*\t");
      
      for(int j=0; j<isp; j++){
          System.out.print("\t");
      }
      
      if(i>0 && i<n-1){
          System.out.print("*\t");
      }
      
      if(i<n/2){
          osp--;
          isp +=2;
      }else{
          osp++;
          isp -=2;
      }
      System.out.println();
  }
 }
}