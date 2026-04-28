import java.util.*;
public class GuessNumber {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand=new Random();
        int secretnumber=rand.nextInt(100)+1;
        int userguess;
        int chances=5;

        System.out.println("=== number guessing game===");
        System.out.println("guess a number between 1 to 100");
        System.out.println("you  have only 5 attempts");
        for(int i=1;i<=chances;i++)
        {
            System.out.println("attempts" + i +":");
             userguess=scan.nextInt();

            if(userguess==secretnumber)
            {
                System.out.println("correct ! you guessed the number!");
            }
            else if(userguess<secretnumber)
            {
                System.out.println("your guess is too low!");

            }
            else {
                System.out.println("your guess is too high");
            }
            if(i==chances)
            {
                System.out.println("game over ! the number was: " +secretnumber);
                System.out.println("thank you for playing this game");

            }
        }
    }
}
