import java.util.Scanner;

public class Evenandodd 
{
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    int num;
    System.out.print("Enter your number :");
    num=input.nextInt();
    

    if(num%2==0)
    {
        System.out.print("Even");

    }
      else{
          System.out.print("Odd");

    }
}


}
