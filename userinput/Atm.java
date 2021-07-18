import java .util.Scanner;
public class Atm {
   public static void main(String[] args){
        int Amount,A,B,C;
        
        System.out.println("Enter your amount");
        Scanner s=new Scanner(System.in);
        Amount=s.nextInt();
         
        while(Amount>=500){
           A=Amount/500;
           Amount=Amount%500;
           System.out.println(A +" 500 notes");
           break;
        }
        while(Amount>=100){
         B=Amount/100;
         Amount=Amount%100;
         System.out.println(B +" 100 notes");
         break;
      }
      while(Amount>=10){
         C=Amount/10;
         Amount=Amount%10;
         System.out.println(C +" 10 notes");
         break;
      }


   }

   
}
