import java.util.Scanner;
import java.util.Random;
public class SlotMachine
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int spin;
        int wheel1;
        int wheel2;
        int wheel3;
        int testToken = 5;
        int userToken;
        int maxToken = 100;

        System.out.println("Welcome to the slot machine. You have 100 tokens. Please choose a start amount ");
        userToken = s.nextInt();

        //invalid numbers
        while(userToken>maxToken||userToken<=0)
        {
            System.out.println("This is not a valid amount, please choose another number ");
            s.nextInt();
        }

        //actual game begins.
        while(userToken>0&&userToken<=maxToken)
        {
            wheel1= r.nextInt(3)+1;
            wheel2= r.nextInt(3)+1;
            wheel3= r.nextInt(3)+1;

            System.out.println("You have " + userToken + " Token. Press y to pull ");
            String pull = "y";
            String user = s.nextLine();//put y plz

            while(! user.equals(pull))
            {
                System.out.println("Press y to pull");
                user = s.nextLine();
            }

            System.out.println("You rolled [" + wheel1 + "] [" + wheel2 + "] [" + wheel3 + "]" );
            if (wheel1 == 1 && wheel2 == 1 && wheel3 == 1)
            {
                System.out.println("Congratulations! You won 4 tokens");
                userToken +=4;
            }
            else
            {
                if(wheel1 == 2 && wheel2 == 2 && wheel3 == 2)
                {
                    System.out.println("Congratulations! You won 8 tokens");
                    userToken +=8;
                }
                else
                {
                    if(wheel1 == 3 && wheel2 == 3 && wheel3 == 3)
                    {
                        System.out.println("Congratulations! You won 12 tokens");
                        userToken +=12;
                    }
                    else
                        System.out.println("Sorry! You did not win");

                }
            }
            userToken-=1;
        }
        System.out.println("Sorry bud you ran out of tokens. Better luck next time.")
    }
}