import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      int res=0, mul=0;
      
      while(n>0){
          int r = n%10;
          n = n/10;
          
          res += r * (int)(Math.pow(2,mul));
          mul++;
      }
    return res;
   }
  }