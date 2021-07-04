import java .util.Scanner;
public class Abc{
    public static void main (String[] agrs)
    {   
        int no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.");
        no=sc.nextInt();
        if (no%2==0){
            System.out.println("No is even" +no);
         }
         else{
             System.out.println("No is odd" +no);
         }
    }
    
            
    }
    


