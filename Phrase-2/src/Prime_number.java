import java.util.Scanner;

public class Prime_number {
public static void main(String[] args)
{
  Scanner input = new Scanner(System.in);
  int num;
  System.out.print("Enter a number :");
  num=input.nextInt();
  int count = 0;


if(num==0 || num==1)

{
  System.out.print("NOT Prime number ");
}
else{
  for(int i = 2 ; i<num ; i++)
  {
      if(num%i==0)
      {
        count++;
        break;

      }
      
    }

      
      if(count==0)
      {
        System.out.print("Prime number");

      }
      else{
        
        System.out.print("NOT Prime number ");
  }

}
}
}

