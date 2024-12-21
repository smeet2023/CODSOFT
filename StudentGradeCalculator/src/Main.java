import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("ENTER THE NUMBER OF SUBJECTS : ");
        int numberOfSubjects = in.nextInt();

        int copyNumberOfSubjects = numberOfSubjects;
        int totalScore = 0;

        while (copyNumberOfSubjects--!=0)
        {
            System.out.println("ENTER NAME OF SUBJECT : " + (numberOfSubjects - copyNumberOfSubjects) + " : ");
            String subject = in.next();
            System.out.println("ENTER THE SCORE OF : " + subject + " = ");
            int score = in.nextInt();
            totalScore+=score;
        }

        System.out.println("TOTAL MARKS : " + totalScore);
        double average = (double) totalScore / numberOfSubjects;
        System.out.println("AVERAGE PERCENTAGE (%) : " + average + "%");

        if (average >= 90) {
            System.out.println("GRADE ACHIEVED = A ");
        } else if (average >= 80) {
            System.out.println("GRADE ACHIEVED = B ");
        } else if (average >= 70) {
            System.out.println("GRADE ACHIEVED = C ");
        } else if (average >= 60) {
            System.out.println("GRADE ACHIEVED = D ");
        } else {
            System.out.println("GRADE ACHIEVED = E ");
        }
    }

}