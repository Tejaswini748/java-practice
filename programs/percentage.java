import java.util.Scanner;
public class percentage {
 public static void main(String[] args){
     float sub1,sub2,sub3,sub4,sub5,sub6, total,percentage,Gp,cgpa;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter marks of six subject");
     System.out.println("Enter marks of sub1");
     sub1=sc.nextFloat();
     System.out.println("Enter marks of sub2 ");
     sub2=sc.nextFloat();
     System.out.println("Enter marks of sub3 ");
     sub3=sc.nextFloat();
     System.out.println("Enter marks of sub4 ");
     sub4=sc.nextFloat();
     System.out.println("Enter marks of sub5 ");
     sub5=sc.nextFloat();
     System.out.println("Enter marks of sub6 ");
     sub6=sc.nextFloat();
     total=sub1+sub2+sub3+sub4+sub5+sub6;
     percentage=(total/600)*100;
     System.out.println("percentage= "+percentage);
     if (percentage>90){
         System.out.println("Grade A");
     }
     else if ((percentage>70)){
        System.out.println("Grade B");
    }
    else if ((percentage>45)){
        System.out.println("Grade C");
    }
    else if((percentage>35)) {
        System.out.println("Grade D");
    }
   else {
        System.out.println("Grade E");
    }
         Gp=(sub1/10)+(sub2/10)+(sub3/10)+(sub4/10)+(sub5/10)+(sub6/10);
     cgpa=(Gp/6);
     System.out.println("cgpa ="+cgpa);
 }   
}
