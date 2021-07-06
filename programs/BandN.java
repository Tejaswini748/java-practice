import java.util.Scanner;
public class BandN {
    public static void main(String[] args){
        String name,pet,str;
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to the BandName Generator");
        System.out.println("What's name of your city you grewup in?");
        name=sc.nextLine();
        System.out.println("what is your pet's name?");
        pet=sc.nextLine();
                System.out.println("your BandName could be "+name+pet);

    }
}
