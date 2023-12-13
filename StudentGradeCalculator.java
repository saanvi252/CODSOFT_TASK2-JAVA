import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take marks obtained out of 100 in each subject
        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        // Calculate total marks
        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter marks for subject " + i + ":");
            int subjectMarks = scanner.nextInt();
            totalMarks += subjectMarks;
        }

        // Calculate Average Percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Grade Calculation
        char grade = calculateGrade(averagePercentage);

        // Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    // Helper method to calculate the grade based on average percentage
    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}