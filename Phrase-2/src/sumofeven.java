import java.util.Scanner;

public class sumofeven {
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    int m,n;
    int sum=0;

    System.out.println("Enter first number :");
    m=input.nextInt();

    System.out.println("Enter last number :");
    n=input.nextInt();

    for(int i =m ; i<=n ; i++)

    {
      if (i%2==0)
      {
        sum=sum+i;
        System.out.print(" "+i);
      }
     
      
    }
    System.out.println("");
    System.out.println("The sum is : "+sum);
}
}
