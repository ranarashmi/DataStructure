import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  int a= sc.nextInt();
  
 for(int i=2; i*i <a; i++){
     while(a%i==0){
         System.out.print(i+" ");
         a = a/i;
     }
 }
  if(a!=1){
      System.out.println(a);
  }
 }
}