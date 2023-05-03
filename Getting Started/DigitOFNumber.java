import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count =0;
      int temp =n;
      while(temp>0){
          temp = temp/10;
          count++;
      }
      int digit =0;
      int d = (int) Math.pow(10,count-1);
      while(d != 0){
          int r = n/d;
           System.out.println(r);
          n = n%d;
          d = d/10;
      }
   }
  }