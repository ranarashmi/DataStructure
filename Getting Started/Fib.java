import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int first =0;
      int sec = 1;
      System.out.println(first);
      System.out.println(sec);

      while(n-->2){
        int third = first + sec;
        System.out.println(third);
        first = sec;
        sec = third;
      }
      

      
   }
  }