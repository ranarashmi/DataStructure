import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  int n= sc.nextInt();
  int r = sc.nextInt();
  
  int count=0, temp = n;
  while(temp-- >0){
      temp = temp/10;
      count++;
  }
  
  int dig=0;
  int div = (int)Math.pow(10,r);
  int re = (n%div)* (int)Math.pow(10,count-r);
  n= n/div;
  
  System.out.println(re+n);
 }
}