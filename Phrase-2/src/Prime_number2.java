import java.util.Scanner;

public class Prime_number2 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        int count=0;

        System.out.print("Enter Fist Number :");
        num1=input.nextInt();
        System.out.print("Enter Last number :");
        num2=input.nextInt();
        for(int i=num1 ; i <num2 ; i++ )
        {
            for(int j =2 ; j<=i-1 ; j++)
            {
                if(i%j==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.print(i);
                count=0;


            }
        }
    }

}
