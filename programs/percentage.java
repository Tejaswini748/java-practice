import java.util.Scanner;
public class percentage {
 public static void main(String[] args){
     float eng,hindi,marathi,phy,chem,science, total,percentage,Gp,cgpa;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter marks of six subject");
     System.out.println("Enter marks of eng");
     eng=sc.nextFloat();
     System.out.println("Enter marks of hindi ");
     hindi=sc.nextFloat();
     System.out.println("Enter marks of marathi ");
     marathi=sc.nextFloat();
     System.out.println("Enter marks of phy ");
     phy=sc.nextFloat();
     System.out.println("Enter marks of chem ");
     chem=sc.nextFloat();
     System.out.println("Enter marks of science ");
     science=sc.nextFloat();
     total=eng+hindi+marathi+phy+chem+science;
     percentage=(total/600)*100;
     System.out .println("percentage= "+percentage);
     if (percentage>90){
         System.out.println("Grade A");
     }
     if ((percentage>70)&&(percentage<90)){
        System.out.println("Grade B");
    }
    if ((percentage>45&&(percentage<70)){
        System.out.println("Grade C");
    }
    if((percentage>35)&&(percentage<45)) {
        System.out.println("Grade D");
    }
    if (percentage<35){
        System.out.println("Grade E");
    }
         Gp=(eng/10)+(hindi/10)+(marathi/10)+(phy/10)+(chem/10)+(science/10);
     cgpa=(Gp/6);
     System.out.println("cgpa ="+cgpa);
 }   
}
