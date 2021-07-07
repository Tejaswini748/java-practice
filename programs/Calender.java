import java.util.Scanner;
public class Calender {
    public static void main(String[] args){
        int yr,month;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year");
        yr=sc.nextInt();
        System.out.println("Enter month");
        month=sc.nextInt();
     switch(month)
     {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            System.out.println("This month is of 31 days");
            break;
        case 2:
            if(((yr%4==0)&&(yr%100!=0))||(yr%400==0))
          {
              System.out.println("This month is of 29 days");
              System .out.println("Year is a leap year");
          }
            else{
              System.out.println("This month is of 28 days");
              System.out.println("Year is not a Leap year");
            }
            break;
        case 4:
        case 6:
        case 9:
        case 11:
             System.out.println("This month is of 30 days");
             break;
     default:
             System.out.println("Enter valid no");
        }
    }   
    
}
