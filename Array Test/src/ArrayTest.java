import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest
{
    ArrayList<Integer> scores = new ArrayList();
    static Scanner keyboard = new Scanner(System.in);
    static int enterNum = 0;
    static int total = 0;
    static int average = 0;
    public void main(String[] args){

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

        display(scores);
    }

    public static void display(ArrayList<Integer> scores)
    {
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
