import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  int n= sc.nextInt();

  int place =1 ,num=0;
  while(n != 0){
      int r = n%10;
      n = n/10;

      num += place * Math.pow(10,r-1);
      place++;
  }
  System.out.println(num);
 }
}