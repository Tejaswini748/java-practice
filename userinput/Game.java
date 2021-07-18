import java.util.Scanner;
import java.lang.Math;
public class Game {
    public static void main(String[] args){
       
        int no=(int)(Math.random()*10);
        int NO;
        char Abc='\0';
        Scanner s=new Scanner(System.in);
        do{
            do{
        System.out.println("Guess the number between 1 to 9");
               System.out.println("Enter Your Number");
        NO=s.nextInt();
        
            if(no==NO){
            System.out.println("Well Guessed\n Congratulation");
           
               }
            else  {
              
            System.out.println("Ooohnooo....");
            System.out.println("Try again");
            
            } 
                      
          }while(no!=NO);
          System.out.println(" Do you want to try Again(y/n)");
            Abc=s.next().charAt(0);
         } while(Abc=='y'||Abc=='Y');
    
        }
    
}
