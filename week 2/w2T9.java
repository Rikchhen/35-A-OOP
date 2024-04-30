import java.util.Scanner;

/*Ask user to give two double input for length and breadth of a rectangle
 and print area type casted to int. */
public class w2T9 {
    public static void main(String[] args) {
        Scanner scan2=new Scanner(System.in);
        System.out.println("Input length");
        double length=scan2.nextDouble();
        System.out.println("Input Breadth: ");
        double breadth= scan2.nextDouble();
        double area=length*breadth;
       
        System.out.println("The area of rectangle is: "+ ((int)area));

        scan2.close();
    }
}