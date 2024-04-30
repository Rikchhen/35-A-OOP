/*Take side of a square from user and print area and perimeter of it. 
Also, calculate Simple Interest,
 Area of triangle and Volume of Cube and Cuboid.
  Take the attributes as user input.

 */
import java.util.Scanner;
public class w2T8 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter side of square: ");
        int side= scan.nextInt();
        System.out.println("Area of square is: "+(side*side));
        System.out.println("Perimeter of square is: "+(2*side));
        System.out.println("Input Amount: ");
        int amount=scan.nextInt();
        System.out.println("Input Rate: ");
        int rate=scan.nextInt();
        System.out.println("Input Time in years: ");
        float time=scan.nextFloat();
        System.out.println("Simple Interest is "+((amount*rate*time)/100));
        System.out.println("Input base of triangle: ");
        int base= scan.nextInt();
        int height= scan.nextInt();
        System.out.println("Area of triangle is: "+(0.5*(base*height)));
        System.out.println("Enter length of cube ");
        int length= scan.nextInt();
        System.out.println("Volume of cube is "+(length*length*length));
        System.out.println("Input length: ");
        int cubLen=scan.nextInt();
        System.out.println("input breadth: ");
        int breadth= scan.nextInt();
        System.out.println("Input height: ");
        int cubHeight=scan.nextInt();
        System.out.println("Volume of cuboid is: "+(cubLen*breadth*cubHeight));
    scan.close();
    
    
    }
}