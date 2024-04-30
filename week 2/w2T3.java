/*Write a program to calculate, 
area of the triangle, and the Volume of the Cube and Cuboid.

Formula: Volume of Cuboid = length*width*height;
 and Volume of Cube: side*side*side; */
 public class w2T3 {
    public static void main(String[] args) {

      int base=10, height=20;
      int area=(1/2)*base*height;
    
      System.out.println("Area of triangle is "+area);

    int len=10, brd=20,hgt=30;
    int volumeCuboid= len*brd*hgt;
    System.out.println("Voulme of cuboid is "+volumeCuboid);
       
    int side=10;
    System.out.println("The volume of cube is "+(side*side*side));
    }
}