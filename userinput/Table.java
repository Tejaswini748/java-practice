import java.util.Scanner;
public class Table {
    public static void main (String[] args){
        int no,T;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Number  ");
        no=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
        T=no*i;
         System.out.println(T);
        }
    }
    
}
