import java.util.Scanner;
public class Simplysq {
    public static void main(String[] args){
        int a,b;
        int A;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A");
        a=sc.nextInt();
        System.out.println("Enter B");
        b=sc.nextInt();
         A=a*a+2*a*b+b*b;
        System .out.println("Ans:"+A);
        }
    }