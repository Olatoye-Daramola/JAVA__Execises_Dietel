package TryoutsAgain;

import java.util.Scanner;

public class ClassRegister {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many students do you have?");
        int studentSize = input.nextInt();
        System.out.println("How many subjects do they do?");
        int courseSize = input.nextInt();

        int[][] studentDetails = getArrayOf(input, studentSize, courseSize);

//        getTotal(studentDetails[]);
        displayArrayOf(courseSize, studentDetails);
    }

    public static int[][] getArrayOf(Scanner input, int studentSize, int courseSize) {
        int[][] studentDetails = new int[studentSize][courseSize];
        for (int student = 0; student < studentDetails.length; student++) {
            System.out.println("Student " + (student + 1));
            for (int course = 0; course < studentDetails[student].length; course++) {
                System.out.print("Course " + (course + 1) + "\t");
                studentDetails[student][course] = input.nextInt();
            }
            System.out.println();
        }
        return studentDetails;
    }

    public static void displayArrayOf(int courseSize, int[][] studentDetails) {
        System.out.print("\n\t\t     ");

        for (int course = 0; course < courseSize; course++) {
            System.out.print("Course " + (course + 1) + "   ");
        }
        System.out.print("Total");
        System.out.println();

        for (int row = 0; row < studentDetails.length; row++) {
            int total = 0;
            System.out.print("Student " + (row + 1) + "\t\t");
            for (int column = 0; column < studentDetails[row].length; column++) {
                System.out.print(studentDetails[row][column] + "\t\t\t");
                total += studentDetails[row][column];
            }
            System.out.println(total);
            System.out.println();
        }
    }

    public static int getTotal(int[] studentDetails) {
        int total = 0;
        for (int row = 0; row < studentDetails.length; row++) {
            int total = 0;
        }
        return total;
    }
}
