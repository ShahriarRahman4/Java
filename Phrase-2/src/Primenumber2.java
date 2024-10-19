import java.util.Scanner;
public class Primenumber2 {

    public static void main(String[] args)
    {
     
     int num1,num2;
     int count = 0 ;
     int i,j;
     try (Scanner input = new Scanner(System.in)) {
        System.out.println("Enter first number :");
         num1=input.nextInt();
         System.out.println("Enter last number");
         num2=input.nextInt();
    }
     for( i = num1 ; i<=num2 ; i++)
     { 
        if(i<2)
        {
            continue;
        }
        for( j = 2 ; j<=i-1 ; j++)
        {
           if(i%j==0)
           {
            count++;
            break;
           }
        }
     }
     if(count==0)
     {
        System.out.println("i");
       

     }
    }
}
