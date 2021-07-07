import java.util.Scanner;
public class Leapyr {
    public static void main (String[] args){
     int year;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enterthe year");
     year=sc.nextInt();
     {if(((yr%4==0)&&(yr%100!=0))||(yr%400==0))
        {
           
         System.out.println("Year is leap year");
                
        }
    }else
     {
         System.out.println ("Year is not a leap year");
     }

    }
}
