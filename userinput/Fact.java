import java.util.Scanner;
public class Fact {
    public static void main(String[] args){
        int i,no,fact=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your No");
        no=sc.nextInt();
        for(i=1;i<=no;i++){
            fact=fact*i;

        }System.out.println("Factorial of number "+ no + " is :- " + fact);
    }

    
}
