import java.util.Scanner;

/*Write a program to take two integer inputs from the user and print the sum and product of them. */
public class w2T6 {
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);


        System.out.println("Enter first Integer: ");
        int int1=scan1.nextInt();
        System.out.println("Enter second integer: ");
        int int2=scan1.nextInt();
        scan1.close();

        int sum= int1+int2;
        int product= int1*int2;
        float division= int1/int2;
        System.out.println("sum is :"+sum);
        System.out.println("product is: "+product);
        System.out.println("division is: "+division);
    }
}