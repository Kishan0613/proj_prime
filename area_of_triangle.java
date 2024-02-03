//program to calculate area of square and triangle 

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
class area_tri
{
    public void triangle()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base of the triangle :");
        int b=sc.nextInt();
        System.out.println("Enter the height of the triangle :");
        float h=sc.nextFloat();
        float area=(float)(0.5*b*h);
        System.out.println("The area of the triangle is :"+area);
    }
}
class area_square extends area_tri
{
    public void square()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the side of the square :");
    int side=sc.nextInt();
    double area=side*side;
    System.out.println("The area of the square is "+area);
    }
}

class area_triangle extends area_square
{
    public static void main(String args[])
    {
        area_square at=new area_square();
        at.triangle();
        at.square();
        }
        
}