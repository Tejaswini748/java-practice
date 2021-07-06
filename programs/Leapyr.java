import java.util.Scanner;
public class Leapyr {
    public static void main (String[] args){
     int year;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enterthe year");
     year=sc.nextInt();
     if((year%4==0) &&(year%100!=0)){
         if(year%100!=0){
           
         System.out.println("Year is leap year");
                
        }
    }else
     {
         System.out.println ("Year is not a leap year");
     }

    }
}
