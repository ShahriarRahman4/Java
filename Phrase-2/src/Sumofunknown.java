import java.util.Scanner;

public class Sumofunknown {
    public static void main(String[] args )
    { 

    Scanner input = new Scanner(System.in);
    int m,n;
    int sum=0;
    

    System.out.print("Enter initial number :");
    m=input.nextInt();

    System.out.print("Enter final number :");
    n=input.nextInt(); 

    for(int i = m ; i<=n ;i++)
    {
      sum = sum + i;
    }
System.out.println("The sum is :"+sum);



}
}
