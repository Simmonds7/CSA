import java.util.Scanner;
import java.util.Random;
public class TicTacToe
{
    public static Random rand = new Random();
    public static Scanner keyboard = new Scanner(System.in);
    private static String X = "X";
    private static String O = "O";
    static int userChoice = 0;
    static int playerType = 0; //"0" is player, "1" is Computer

    static String[][] board = {
            {String.valueOf(1), String.valueOf(2), String.valueOf(3)},
            {String.valueOf(4), String.valueOf(5), String.valueOf(6)},
            {String.valueOf(7), String.valueOf(8), String.valueOf(9)}
    };

    public static void main(String args[])
    {


        System.out.println("Welcome to Tic Tac Toe, The computer is O and the player is X. Please begin the game by carefully selecting a space for your first X.");
        System.out.println("|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
        System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
        System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");

        userChoice = 1;
        Place(userChoice);

    }

    public static void Place(int choice)
    {
        if (!(((board[0][0] == X && board[0][1] == X && board[0][2] == X) || (board[1][0] == X && board[1][1] == X && board[1][2] == X) || (board[2][0] == X && board[2][1] == X && board[2][2] == X) || (board[0][0] == X && board[1][0] == X && board[2][0] == X) || (board[0][1] == X && board[1][1] == X && board[2][1] == X) || (board[0][2] == X && board[1][2] == X && board[2][2] == X) || (board[0][0] == X && board[1][1] == X && board[2][2] == X) || (board[0][2] == X && board[1][1] == X && board[2][0] == X)) || ((board[0][0] == X && board[0][1] == X && board[0][2] == X) || (board[1][0] == X && board[1][1] == X && board[1][2] == X) || (board[2][0] == X && board[2][1] == X && board[2][2] == X) || (board[0][0] == X && board[1][0] == X && board[2][0] == X) || (board[0][1] == O && board[1][1] == O && board[2][1] == O) || (board[0][2] == O && board[1][2] == O && board[2][2] == O) || (board[0][0] == O && board[1][1] == O && board[2][2] == O) || (board[0][2] == X && board[1][1] == O && board[2][0] == O))))
        {
            if (playerType == 0) {
                System.out.println("Input a number");
                choice = keyboard.nextInt();
                if (choice == 1) {
                    if (board[0][0] == X) {
                        System.out.println("Space already selected, please pick another space.");
                        userChoice = keyboard.nextInt();
                        Place(userChoice);
                    } else if (board[0][0] == O) {
                        System.out.println("Space already selected, please pick another space.");
                        userChoice = keyboard.nextInt();
                        Place(userChoice);
                    } else {
                        board[0][0] = X;
                        System.out.println("|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
                        System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
                        System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
                        System.out.println("X placed, Computer's turn.");
                        playerType = 1;
                        Place(userChoice);
                    }
                } else if (choice == 2) {
                    if (board[0][1] == X) {
                        System.out.println("Space already selected, please pick another space.");
                        userChoice = keyboard.nextInt();
                        Place(userChoice);
                    } else if (board[0][1] == O) {
                        System.out.println("Space already selected, please pick another space.");
                        userChoice = keyboard.nextInt();
                        Place(userChoice);
                    } else {
                        board[0][1] = X;
                        System.out.println("|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
                        System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
                        System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
                        System.out.println("X placed, Computer's turn.");
                        playerType = 1;
                        Place(userChoice);
                    }
                } else if (choice == 3) {
                    if (board[0][2] == X) {
                        System.out.println("Space already selected, please pick another space.");
                        userChoice = keyboard.nextInt();
                        Place(userChoice);
                    } else if (board[0][2] == O) {
                        System.out.println("Space already selected, please pick another space.");
                        userChoice = keyboard.nextInt();
                        Place(userChoice);
                    } else {
                        board[0][2] = X;
                        System.out.println("|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
                        System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
                        System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
                        System.out.println("X placed, Computer's turn.");
                        playerType = 1;
                        Place(userChoice);
                    }
                } else if (choice == 4) {
                    if (board[1][0] == X) {
                        System.out.println("Space already selected, please pick another space.");
                        userChoice = keyboard.nextInt();
                        Place(userChoice);
                    } else if (board[1][0] == O) {
                        System.out.println("Space already selected, please pick another space.");
                        userChoice = keyboard.nextInt();
                        Place(userChoice);
                    } else {
                        board[1][0] = X;
                        System.out.println("|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
                        System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
                        System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
                        System.out.println("X placed, Computer's turn.");
                        playerType = 1;
                        Place(userChoice);
                    }
                } else if (choice == 5) {
                    if (board[1][1] == X) {
                        System.out.println("Space already selected, please pick another space.");
                        userChoice = keyboard.nextInt();
                        Place(userChoice);
                    } else if (board[1][1] == O) {
                        System.out.println("Space already selected, please pick another space.");
                        userChoice = keyboard.nextInt();
                        Place(userChoice);
                    } else {
                        board[1][1] = X;
                        System.out.println("|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
                        System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
                        System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
                        System.out.println("X placed, Computer's turn.");
                        playerType = 1;
                        Place(userChoice);
                    }
                } else if (choice == 6) {
                    if (board[1][2] == X) {
                        System.out.println("Space already selected, please pick another space.");
                        userChoice = keyboard.nextInt();
                        Place(userChoice);
                    } else if (board[1][2] == O) {
                        System.out.println("Space already selected, please pick another space.");
                        userChoice = keyboard.nextInt();
                        Place(userChoice);
                    } else {
                        board[1][2] = X;
                        System.out.println("|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
                        System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
                        System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
                        System.out.println("X placed, Computer's turn.");
                        playerType = 1;
                        Place(userChoice);
                    }
                } else if (choice == 7) {
                    if (board[2][0] == X) {
                        System.out.println("Space already selected, please pick another space.");
                        userChoice = keyboard.nextInt();
                        Place(userChoice);
                    } else if (board[2][0] == O) {
                        System.out.println("Space already selected, please pick another space.");
                        userChoice = keyboard.nextInt();
                        Place(userChoice);
                    } else {
                        board[2][0] = X;
                        System.out.println("|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
                        System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
                        System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
                        System.out.println("X placed, Computer's turn.");
                        playerType = 1;
                        Place(userChoice);
                    }
                } else if (choice == 8) {
                    if (board[2][1] == X) {
                        System.out.println("Space already selected, please pick another space.");
                        userChoice = keyboard.nextInt();
                        Place(userChoice);
                    } else if (board[2][1] == O) {
                        System.out.println("Space already selected, please pick another space.");
                        userChoice = keyboard.nextInt();
                        Place(userChoice);
                    } else {
                        board[2][1] = X;
                        System.out.println("|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
                        System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
                        System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
                        System.out.println("X placed, Computer's turn.");
                        playerType = 1;
                        Place(userChoice);
                    }
                } else if (choice == 9) {
                    if (board[2][2] == X) {
                        System.out.println("Space already selected, please pick another space.");
                        userChoice = keyboard.nextInt();
                        Place(userChoice);
                    } else if (board[2][2] == O) {
                        System.out.println("Space already selected, please pick another space.");
                        userChoice = keyboard.nextInt();
                        Place(userChoice);
                    } else {
                        board[2][2] = X;
                        System.out.println("|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
                        System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
                        System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
                        System.out.println("X placed, Computer's turn.");
                        playerType = 1;
                        Place(userChoice);
                    }
                }
                else if (choice < 1 || choice > 9)
                {
                    System.out.println("Really, the numbers are pretty clear... Try again.");
                    userChoice = keyboard.nextInt();
                    Place(userChoice);
                }
            } else {
                int n = rand.nextInt(9);
                n += 1;
                if (n == 1) {
                    if (board[0][0] == X) {
                        Place(userChoice);
                    } else if (board[0][0] == O) {
                        Place(userChoice);
                    } else {
                        board[0][0] = O;
                        System.out.println("|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
                        System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
                        System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
                        System.out.println("O placed, Player's turn.");
                        playerType = 0;
                        Place(userChoice);
                    }
                } else if (n == 2) {
                    if (board[0][1] == X) {
                        Place(userChoice);
                    } else if (board[0][1] == O) {
                        Place(userChoice);
                    } else {
                        board[0][1] = O;
                        System.out.println("|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
                        System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
                        System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
                        System.out.println("O placed, Player's turn.");
                        playerType = 0;
                        Place(userChoice);
                    }
                } else if (n == 3) {
                    if (board[0][2] == X) {
                        Place(userChoice);
                    } else if (board[0][2] == O) {
                        Place(userChoice);
                    } else {
                        board[0][2] = O;
                        System.out.println("|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
                        System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
                        System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
                        System.out.println("O placed, Player's turn.");
                        playerType = 0;
                        Place(userChoice);
                    }
                } else if (n == 4) {
                    if (board[1][0] == X) {
                        Place(userChoice);
                    } else if (board[1][0] == O) {
                        Place(userChoice);
                    } else {
                        board[1][0] = O;
                        System.out.println("|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
                        System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
                        System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
                        System.out.println("O placed, Player's turn.");
                        playerType = 0;
                        Place(userChoice);
                    }
                } else if (n == 5) {
                    if (board[1][1] == X) {
                        Place(userChoice);
                    } else if (board[1][1] == O) {
                        Place(userChoice);
                    } else {
                        board[1][1] = O;
                        System.out.println("|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
                        System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
                        System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
                        System.out.println("O placed, Player's turn.");
                        playerType = 0;
                        Place(userChoice);
                    }
                } else if (n == 6) {
                    if (board[1][2] == X) {
                        Place(userChoice);
                    } else if (board[1][2] == O) {
                        Place(userChoice);
                    } else {
                        board[1][2] = O;
                        System.out.println("|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
                        System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
                        System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
                        System.out.println("O placed, Player's turn.");
                        playerType = 0;
                        Place(userChoice);
                    }
                } else if (n == 7) {
                    if (board[2][0] == X) {
                        Place(userChoice);
                    } else if (board[2][0] == O) {
                        Place(userChoice);
                    } else {
                        board[2][0] = O;
                        System.out.println("|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
                        System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
                        System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
                        System.out.println("O placed, Player's turn.");
                        playerType = 0;
                        Place(userChoice);
                    }
                } else if (n == 8) {
                    if (board[2][1] == X) {
                        Place(userChoice);
                    } else if (board[2][1] == O) {
                        Place(userChoice);
                    } else {
                        board[2][1] = O;
                        System.out.println("|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
                        System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
                        System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
                        System.out.println("O placed, Player's turn.");
                        playerType = 0;
                        Place(userChoice);
                    }
                } else if (n == 9) {
                    if (board[2][2] == X) {
                        Place(userChoice);
                    } else if (board[2][2] == O) {
                        Place(userChoice);
                    } else {
                        board[2][2] = O;
                        System.out.println("|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
                        System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
                        System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
                        System.out.println("O placed, Player's turn.");
                        playerType = 0;
                        Place(userChoice);
                    }
                }
            }
        }
        else if ((board[0][0] == X && board[0][1] == X && board[0][2] == X) || (board[1][0] == X && board[1][1] == X && board[1][2] == X) || (board[2][0] == X && board[2][1] == X && board[2][2] == X) || (board[0][0] == X && board[1][0] == X && board[2][0] == X) || (board[0][1] == X && board[1][1] == X && board[2][1] == X) || (board[0][2] == X && board[1][2] == X && board[2][2] == X) || (board[0][0] == X && board[1][1] == X && board[2][2] == X) || (board[0][2] == X && board[1][1] == X && board[2][0] == X))
        {
            System.out.println("The player wins!");
        }
        else if ((board[0][0] == O && board[0][1] == O && board[0][2] == O) || (board[1][0] == O && board[1][1] == O && board[1][2] == O) || (board[2][0] == O && board[2][1] == O && board[2][2] == O) || (board[0][0] == O && board[1][0] == O && board[2][0] == O) || (board[0][1] == O && board[1][1] == O && board[2][1] == O) || (board[0][2] == O && board[1][2] == O && board[2][2] == O) || (board[0][0] == O && board[1][1] == O && board[2][2] == O) || (board[0][2] == O && board[1][1] == O && board[2][0] == O))
        {
            System.out.println("The computer wins! (Player... You lost to a random number generator.)");
        }
        else
        {
            System.out.println("Congrats! You tied (Player. I'm ashamed of you... You tied with something that can't think... What does that make you?");
        }

    }
}
