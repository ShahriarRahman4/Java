import java.util.Scanner;
public class sumofsqure {

    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);

      int n;
      int sum = 0;

      System.out.println("Enter the last number : ");
      n=input.nextInt();

      for(int i = 1 ; i<=n ; i++)
      {
        System.out.print(i+"X"+i+" ");
        sum = sum+1;

       
      }
      System.out.println();

      System.out.println("The sum of numbers: "+sum);

    }
}
