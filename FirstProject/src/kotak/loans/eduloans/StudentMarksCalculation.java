package kotak.loans.eduloans;

import java.util.Scanner;

public class StudentMarksCalculation 
{
	
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Number of students and subjects
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        // Create arrays to store marks and average
        int[][] marks = new int[numberOfStudents][numberOfSubjects];
        double[] averages = new double[numberOfStudents];

        // Input marks for each student
        for (int i = 0; i < numberOfStudents; i++) 
        {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            int totalMarks = 0;
            for (int j = 0; j < numberOfSubjects; j++) 
            {
                System.out.print("Marks for subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
                totalMarks += marks[i][j];  // Accumulate total marks
            }
            // Calculate average
            averages[i] = (double) totalMarks / numberOfSubjects;
        }

        // Display results
        System.out.println("\nStudent Results:");
        for (int i = 0; i < numberOfStudents; i++) 
        {
            System.out.printf("Student - %d Average: %.2f, Grade: %s%n", 
                (i + 1), averages[i], calculateGrade(averages[i]));
        }

        // Close the scanner
        scanner.close();
    }

    // Method to calculate grade based on average marks
    private static String calculateGrade(double average) 
    {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

}
