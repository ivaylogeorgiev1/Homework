/*
 * TicTacToe.java
 *
 * created at 9.12.2015 �. by admin <YOURMAILADDRESS>
 * 
 */
package additionalProblems;


import java.util.Scanner;


public class TicTacToe
{

    static char[][] board;

    static char currentPlayerMark;


    public TicTacToe()
    {
        board = new char[3][3];
        currentPlayerMark = 'x';
        initializeBoard();
    }


    public void initializeBoard()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                board[i][j] = '-';
            }
        }
    }


    public void printBoard()
    {
        System.out.println("-------------");

        for (int i = 0; i < 3; i++)
        {
            System.out.print("| ");

            for (int j = 0; j < 3; j++)
            {
                System.out.print(board[i][j] + " | ");
            }

            System.out.println();

            System.out.println("-------------");

        }

    }


    public boolean isBoardFull()
    {
        boolean isFull = true;

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (board[i][j] == '-')
                {
                    isFull = false;
                }
            }
        }

        return isFull;

    }


    public boolean checkForWin()
    {
        return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
    }


    // Check Rows.
    private boolean checkRowsForWin()
    {
        for (int i = 0; i < 3; i++)
        {
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true)
            {
                return true;
            }
        }
        return false;
    }


    // Check Columns.
    private boolean checkColumnsForWin()
    {
        for (int i = 0; i < 3; i++)
        {
            if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true)
            {
                return true;
            }
        }
        return false;
    }


    // Check diagonals.
    private boolean checkDiagonalsForWin()
    {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
    }


    // Check to see if all three values are the same (and not empty) indicating a win.
    private boolean checkRowCol(char c1, char c2, char c3)
    {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }


    // Change player marks.
    public void changePlayer()
    {
        if (currentPlayerMark == 'x')
        {
            currentPlayerMark = 'o';
        }
        else
        {
            currentPlayerMark = 'x';
        }
    }


    // Places a mark at the cell specified by row and col with the mark of the current player.
    public boolean placeMark(int row, int col)
    {
        if ((row >= 0) && (row < 3))
        {
            if ((col >= 0) && (col < 3))
            {
                if (board[row][col] == '-')
                {
                    board[row][col] = currentPlayerMark;

                    return true;
                }
                else
                {
                    return false;
                }

            }

        }

        return false;

    }


    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        TicTacToe game = new TicTacToe();

        while (!(game.checkForWin()))
        {

            Scanner sc = new Scanner(System.in);
            System.out.println("Please input the row at which your mark will be (between 1 and 3).");
            int row = sc.nextInt();
            System.out.println("Please input the colomn at which your mark will be(between 1 and 3).");
            int col = sc.nextInt();

            // Player 'x' places a mark in row (row), column (col)

            if (game.placeMark((row - 1), (col - 1)))
            {

                // Print the board
                game.printBoard();

                // Winner check.
                if (game.checkForWin())
                {

                    System.out.println("We have a winner!");

                    System.exit(0);
                    
                }

                else if (game.isBoardFull())
                {

                    System.out.println("It's a draw!");

                    System.exit(0);

                }

                // If no winner or draw, switch player to 'o'

                game.changePlayer();

            }else{
                System.out.println("Wrong coordinates. Plese input new ones.");
            }
        }

    }
}
