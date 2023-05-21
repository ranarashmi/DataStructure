import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
      int  destBase= scn.nextInt();
      int d = getValueIndecimal(n, sourceBase);
      int result = getValueToResBase(d,destBase);
      System.out.println(result);
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
   
   public static int getValueToResBase(int n, int d){
       int res=0, mul=1;
       
       while(n>0){
           int r = n%d;
           n= n/d;
           
           res += r * mul;
           mul = mul * 10;
       }
       return res;
   }
  }