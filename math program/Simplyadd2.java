import java.util.Scanner;
public class Simplyadd2{
    public static void main(String[] args){
        int a,b,c,d;
        int A;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A");
        a=sc.nextInt();
        System.out.println("Enter B");
        b=sc.nextInt();
        System.out.println("Enter C");
        c=sc.nextInt();
        System.out.println("Enter D");
        d=sc.nextInt();
        A=(a+b+c)/d;
        System .out.println("Ans:"+A);
        }
}