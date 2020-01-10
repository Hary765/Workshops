
import java.util.Scanner;

public class GCD
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //user inputs two numbers//

        System.out.println("Please enter two integers in which you want to find the greatest common divisor for.");
        System.out.print("Integer 1: ");
        int num1 = scan.nextInt();
        System.out.print("Integer 2: ");
        int num2 = scan.nextInt();

        //seeing if user is wrong//
        while (num1 <= 0 || num2 <= 0)
        {
            System.out.println("The numbers must be positive. Please try again.");

            System.out.print("Integer 1:");
            num1 = scan.nextInt();
            System.out.print("Integer 2:");
            num2 = scan.nextInt();
        }
        
        int smallNum;
        int count;

        //finding smaller number
        if (num1 > num2)
            smallNum = num2;
        else
            smallNum = num1;

        for (count = smallNum; count>=1; count--)
        {
            if (num1 % count == 0 && num2 % count == 0)
            {
                System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is " + count + ".");
                break;
            }
        }
    }
}