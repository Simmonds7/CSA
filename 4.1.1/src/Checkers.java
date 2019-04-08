public class Checkers
{
    public static void main(String args[]) {
        String[][] checkerBoard = new String[8][8];

        for (int i = 0; i < checkerBoard.length; i++) {
            int oddRow = i % 2;
            if (oddRow != 0)
            {
                for (int j = 0; j < checkerBoard[0].length; j++) {
                    int oddColumn = j % 2;

                    if (oddColumn != 0)
                    {
                        checkerBoard[i][j] = " W";
                    }
                    else
                    {
                        if (i == 0 || i == 1 || i == 2)
                        {
                            checkerBoard[i][j] = "BC";
                        }
                        else if (i == 5 || i == 6 || i == 7)
                        {
                            checkerBoard[i][j] = "WC";
                        }
                        else
                        {
                            checkerBoard[i][j] = " B";
                        }
                    }
                }
            }
            else
            {
                for (int j = 0; j < checkerBoard[0].length; j++) {
                    int oddColumn = j % 2;

                    if (oddColumn != 0)
                    {
                        if (i == 0 || i == 1 || i == 2)
                        {
                            checkerBoard[i][j] = "BC";
                        }
                        else if (i == 5 || i == 6 || i == 7)
                        {
                            checkerBoard[i][j] = "WC";
                        }
                        else
                        {
                            checkerBoard[i][j] = " B";
                        }
                    }
                    else
                    {
                        checkerBoard[i][j] = " W";
                    }
                }
            }

        }

        for (int r = 0; r < checkerBoard.length; r++)
        {
            System.out.print("|");
            for (int c = 0; c < checkerBoard[r].length; c++)
            {
                System.out.print(" " + checkerBoard[r][c] + " |");
            }
            System.out.println();
        }

        // Print out the board as 8 rows with either null,
        // "BLACK", or "WHITE" in each element
        // Hint: use both the println and print methods
        // of System.out

    }
}
