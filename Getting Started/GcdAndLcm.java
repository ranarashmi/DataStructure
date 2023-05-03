import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  int a= sc.nextInt();
  int b = sc.nextInt();
  
  int n1=a , n2=b;
  
  while(n1%n2 !=0){
      int r = n1%n2;
      n1= n2;
      n2=r;
  }
  
  int gcd= n2;
  int lcm = (a*b)/gcd;
  
  System.out.println(gcd);
  System.out.println(lcm);
  
 }
}