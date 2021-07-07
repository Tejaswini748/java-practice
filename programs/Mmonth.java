import java.util.Scanner;
public class Mmonth {
     public static void main(String[] args){
        int no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no between 1-12");
        no=sc.nextInt();
        switch(no)
        {
            case 1:
               System.out.println("Chaitra");
               break;
             case 2:
               System.out.println("VaishakhY");
               break;
            case 3:
               System.out.println("Jeshtha");
               break;
            case 4:
               System.out.println("Aashad");
               break;
            case 5:
               System.out.println("Shravan");
               break;
            case 6:
               System.out.println("Bhadrapad");
               break;
            case 7:
               System.out.println("Ashiwn");
               break;
            case 8:
               System.out.println("Kartik");
               break;
            case 9:
               System.out.println("Margashirshya");
               break;
            case 10:
               System.out.println("Paush");
               break;
            case 11:
               System.out.println("Maagh");
               break;
            case 12:
               System.out.println("Faalgun");
               break;
            default:
                 System.out.println("Invalid input")   ;

        }

    }
    
    
}

