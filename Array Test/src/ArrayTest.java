import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest
{
    public static void main(String[] args){
        ArrayList<Integer> scores = new ArrayList();
        Scanner keyboard = new Scanner(System.in);
        int enterNum = 0;
        int total = 0;
        int average = 0;
        System.out.println("Please enter Scores. Use 999 to exit.");

        do
        {
            enterNum = keyboard.nextInt();
            if (enterNum == 999)
            {
                break;
            }
            else
            {
                scores.add(enterNum);
            }
        } while (enterNum != 999);

        for (int i = 0; i < scores.size(); ++i)
        {
            System.out.println("Score " + (i + 1) + ": " + scores.get(i));
            total = total + scores.get(i);
        }

        average = (total / scores.size());

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
