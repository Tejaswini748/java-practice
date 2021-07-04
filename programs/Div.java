import java.util.Scanner;
public class Div {
    public static void main(String[] args) {
        
          int no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
         no=sc.nextInt();
         if((no%3==0)&&(no%5==0)){
             System.out.println("FooBar");
         }
          else if (no%5==0){
             System.out.println("Bar");
         }
         else if(no%3==0){
            System.out.println("Foo");
         }else{
            System.out .println("Number is not vaild");
        }
    }
    
}
