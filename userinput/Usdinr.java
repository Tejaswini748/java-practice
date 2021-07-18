import java .util.Scanner;
public class Usdinr {
 public static void main(String[] args) {
        float Doller,Rupees;
        int no; char Ans;
        Scanner sc=new Scanner(System.in);
       do{
        System.out.println("Welcome to USD to INR converter");
        System.out.println("Choose anyone.\n1.Usd to INR.\n2.INR to USD ");
     
     no=sc.nextInt();
     switch(no){
     case 1:
      System.out.println("Enter Value in USd");
      Doller =sc.nextFloat();
      Rupees=Doller*74;
      System.out.println("Rupees Value = "+Rupees);
      break;
      case 2:
      System.out.println("Enter Value in INR");
     Rupees =sc.nextFloat();
      Doller=Rupees/74;
      System.out.println("Doller = "+Doller);
      break;
     } 
     System.out.print("Do you want  do it again(y/n)?");
     Ans= sc.next().charAt(0);
       }while(Ans=='y'||Ans=='Y');

     
     
     

      }
    }

