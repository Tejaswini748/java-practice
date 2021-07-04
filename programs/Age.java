import java.util.Scanner;
 public class Age {
     public static void main (String[] args){
         int no;
         Scanner sc=new Scanner(System.in);
         System.out .println("enter the age");
         no=sc.nextInt();
         if(no>=18){
             System.out.println("Person is eligiable to vote");
            }
            else{
                System.out.println("Person is not eligiable to vote");
            }

     }
    
}
