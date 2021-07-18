import java.util.Scanner;
public class Floppy {
    public static void main(String[] args)
    {
        float free_Space,used_space,deleted,added;
        double total,nused_space,newTotal,newfree_space;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Free bytes of Floppy Disk");
        free_Space=sc.nextFloat();
        System.out.println("Enter used bytes of Floppy Disk");
        used_space=sc.nextFloat();
         total=(free_Space+used_space);
        System.out.println("Total Bytes of Floppy disk "+total);
        System.out.println("Enter Bytes to Be deleted");
        deleted=sc.nextFloat();
        System.out.println( deleted +" Bytes to Be deleted");
        nused_space=used_space-deleted;
       newfree_space=free_Space+deleted;
        System.out.println(newfree_space +" Bytes are free");
        System.out.println("Enter  added Bytes to Be added");
        added=sc.nextFloat();
        
        if(newfree_space>=added){
          newTotal=newfree_space+added;
          System.out.println(added + " Bytes are added ");
          System.out.println( "Total Bytes in Floppy disk are "+l);
        }else{
            System.out.println("Bytes can'total be stored FILE IS TO BIG");
        }
    }
}