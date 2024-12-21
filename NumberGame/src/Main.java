import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int startRange = 1;
        int endRange = 100;

        System.out.println("THE STARTING NUMBER IS  : " + startRange);
        System.out.println("THE ENDING NUMBER IS  : " + endRange);


        Random random = new Random();
        int randomNumber = random.nextInt(endRange - startRange + 1) + startRange;

        System.out.println("THE RANDOM NUMBER HAS BEEN DECIDED !" + randomNumber);

        System.out.println("HOW MANY ATTEMPTS WOULD YOU LIKE TO GUESS THE NUMBER ? ");

        int attempts = in.nextInt();
        int score = 0;
        int roundCounter = 0;
        int copyAttempt = attempts;

        String choice = "";

        while(!(choice.equals("end")) || !(choice.equals("0")))
        {
            copyAttempt = attempts;

            System.out.println("IF YOU TO TERMINATE THIS ROUND , THEN TYPE END OR 0 TO GET THE SCORE");
            choice = in.next();
            if(choice.equals("end") || choice.equals("0"))
            {
                System.out.println("==============================================");
                System.out.println("YOUR SCORE FOR ROUND : " + roundCounter + " IS = " + score);
                break;
            }
            roundCounter++;
            int roundScore = 0;

            while(copyAttempt--!=0)
            {
                System.out.println("==============================================");
                System.out.println("ENTER YOUR GUESSED NUMBER : ");

                int userNumber= in.nextInt();
                if(userNumber == randomNumber){
                    System.out.println("YOU GUESSED IT CORRECT !");
                    System.out.println("==============================================");
                    score++;
                    roundScore++;
                    break;
                } else if (userNumber < randomNumber) {
                    System.out.println("IT WAS LOW NUMBER !");
                    System.out.println("==============================================");
                }
                else {
                    System.out.println("IT WAS A HIGH NUMBER !");
                    System.out.println("==============================================");
                }
            }
            System.out.println("FOR ROUND : " + roundCounter + " YOU SCORED FULL = " + roundScore);
        }
        System.out.println("YOU TOOK : " + roundCounter + "ROUNDS  WITH THE TOTAL SCORE = " + score);
        System.out.println("==============================================");
    }
}
