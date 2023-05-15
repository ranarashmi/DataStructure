import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();

     int osp =0;
     int st =n;

     for(int i=0;i<n; i++){

         for(int j=0; j<osp; j++){
             System.out.print("\t");
         }

         for(int j=0; j<st;j++){
             if(i>0 && i<n/2 && j>0 && j<st-1){
                 System.out.print("\t");
             }else{
                 System.out.print("*\t");
             }
             
         }
         if(i<n/2){
             st -=2;
             osp++;
         }else{

             st +=2;
             osp--;
         }

         System.out.println();
     }

 }
}