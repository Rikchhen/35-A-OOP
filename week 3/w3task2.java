/*  Write a JAVA program to check whether a number is negative, positive, or zero*/
public class w3task2 {
    public static void main(String[] args) {

        int number = -5;
         if (number > 0) {
             System.out.println(number + " is a positive number.");
         } else if (number < 0) {
             System.out.println(number + " is a negative number.");
         } else {
             System.out.println(number + " is zero.");
         }
     }
}