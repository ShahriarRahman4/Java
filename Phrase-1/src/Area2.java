import java.util.Scanner;

public class Area2 {
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);

    double radius,area;

    System.out.print("Enter radius :");
    radius=input.nextDouble();

    area=3.1414*radius*radius;

    System.out.println("Area of the circle = "+area);


}
}
