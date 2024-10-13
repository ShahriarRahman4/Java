import java.util.Scanner;


public class Conditional {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter any number :");

        num=input.nextInt();

        if(num>0)
        {
            System.out.print("Positve");

        }
        else if(num<0)
        {

            System.out.print("Negative");

        }

        else
        {
             System.out.print("Zero");

        }

    }

}
