import java.util.Scanner;
/*Take the name, roll number, and field of interest from the user
 and print in the format below
 : Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. */
public class w2T7 {
public static void main(String[] args) {
    Scanner scan1=new Scanner(System.in);
        System.out.println("What is your name?");
        String name=scan1.nextLine();
        System.out.println("Roll NO?: ");
        int roll= scan1.nextInt();
        System.out.println("Field of Interest? ");
        String interest=scan1.nextLine();
        scan1.close();
       
    System.out.println("My name is "+name+" My roll number is "+roll+" My field of interest is "+interest);

}
    
    
}