import java.util.Scanner;
public class Grtstno {
public static void main(String []args) {
    int no1,no2,no3;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no1");
    no1=sc.nextInt();
    System.out.println("Enter no2");
    no2=sc.nextInt();
    System.out.println("Enter no3");
    no3=sc.nextInt();
 if((no1>no2)&&(no1>no3)){
     System.out.println("No1 is Greatest " + no1);
 }else if((no2>no1)&&(no2>no3)){
     System.out.println("No2 is Greatest " +no2);
 }else {
     System.out.println("No3 is Greatest " +no3);
 }
}
    
}
