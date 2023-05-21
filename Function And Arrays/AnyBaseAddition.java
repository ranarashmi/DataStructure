import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
       int result=0;
       int carry=0, sum =0, mul=1;
       
       while(n1>0 || n2>0|| carry>0){
           int num1 = n1%10;
           int num2 = n2%10;
           
           sum = num1 + num2 + carry;
           carry = sum/b;
           int val = sum %b;
           
           result +=mul * val;
           mul = mul * 10;
           
           n1 /=10;
           n2 /=10;
       }
       return result;
   }
  }