package kotak.loans.eduloans;

import java.util.Scanner;

public class TwoDimensionalArrayExample 
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Define the dimensions of the 2D array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Create a 2D array
        int[][] array = new int[rows][cols];

        // Input values into the 2D array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Print the 2D array
        System.out.println("\nThe 2D array is:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(array[i][j] + "\t");  // Print with tab space
            }
            System.out.println();  // Move to the next line after each row
        }

        // Close the scanner
        scanner.close();
    }

}
