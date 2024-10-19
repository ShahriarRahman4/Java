import java.util.Scanner;

public class sumoffloat {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        float n;
        float sum = 0f;
        float i;

        System.out.println("Enter the last number :");
        n = input.nextFloat();

        for(i = (float) 1.5 ; i<=n ; i=i + 1)
        {
            sum = sum + i ;
            System.out.print(" "+i);

        }
        System.out.println(" ");
       System.out.println(" "+sum);


    }
}
