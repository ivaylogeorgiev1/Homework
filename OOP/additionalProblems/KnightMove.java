/*
 * KnightMove.java
 *
 * created at 11.12.2015 �. by admin <YOURMAILADDRESS>
 * 
 */
package additionalProblems;


import java.util.Scanner;


public class KnightMove
{

    static char[][] knightMove(char[][] array, int row, int col)
    {

        // Base cases.
        if ((row < 0) || (row >= array.length))
        {
            return array;
        }
         if ((col < 0) || (col >= array[0].length))
        {
            return array;
        }
         if ((array[row][col] == '*'))
        {
            return array;
        }
        else
        {

            // Printing the element.
            array[row][col] = '*';

            // Recursive connections.

             knightMove(array, row - 2, col + 1);
             knightMove(array, row - 1, col + 2);
             knightMove(array, row + 1, col + 2);
             knightMove(array, row + 2, col + 1);
             knightMove(array, row + 2, col - 1);
             knightMove(array, row + 1, col - 2);
             knightMove(array, row - 1, col - 2);
             knightMove(array, row - 2, col - 1);

            return array;
        }
    }


    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input number of rows of the array.");
        int row = sc.nextInt();
        System.out.println("Please input number of columns of the array.");
        int col = sc.nextInt();

        char[][] array = new char[row][col];
        for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = '-';
			}
		}

        System.out.println("Please input number of the starting position's row.");
        int rowStart = sc.nextInt();
        System.out.println("Please input number of the starting position's column.");
        int colStart = sc.nextInt();

        knightMove(array, rowStart-1, colStart-1);
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }

}
