import java.util.Scanner;
public class Temp {
    public static void main(String[] args)
    {
        Float f,C;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Fahrenheit tempreature");
        f=sc.nextFloat();
        C =(f-32)*5/9;
      System.out.println("Celsius value is ="+C);
      System.out.println("Enter Celsius tempreature");
      C=sc.nextFloat();
      f=(C*9/5)+32;
      System.out.println("Fahrenheit tempreature value is ="+f);
    }
}


