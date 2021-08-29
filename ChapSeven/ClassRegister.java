package TryoutsAgain;

import java.util.Scanner;

public class ClassRegister {
    private static int studentSize, courseSize;
    private static int[] position;

    public static void main(String[] args) {



        int[][] studentDetails = getArrayOf();

        displayArrayOf(studentDetails);

        System.out.println("The best student is Student " + getBestStudent(studentDetails));
        System.out.println("The worst student is Student " + getWorstStudent(studentDetails));
    }

    public static int[][] getArrayOf() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many students do you have?");
        int studentSize = input.nextInt();
        position = new int[studentSize];
        System.out.println("How many subjects do they do?");
        int courseSize = input.nextInt();

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

    public static void displayArrayOf(int[][] studentDetails) {
        System.out.print("\n\t\t    ");

        for (int course = 0; course < studentDetails[courseSize].length; course++) {
            System.out.print("Course " + (course + 1) + "    ");
        }
        System.out.print("  Total\t   Average\t   Position");
        System.out.println();

        for (int row = 0; row < studentDetails.length; row++) {
            System.out.print("Student " + (row + 1) + "\t\t");
            for (int column = 0; column < studentDetails[row].length; column++) {
                System.out.print(studentDetails[row][column] + "\t\t\t");
            }
            System.out.print(getTotalScorePerStudentOf(studentDetails)[row]);
            System.out.printf("\t\t%.2f", getAverageScorePerStudentOf(studentDetails)[row]);
            System.out.println("\t\t" + calculatePosition()[row]);

            System.out.println();
        }

        System.out.println("=".repeat(80));
        System.out.print("Total\t\t\t");

        for (int row = 0; row < studentDetails.length; row++) {
            System.out.print(getTotalScorePerCourseOf(studentDetails)[row] + "\t\t\t");
        }

        System.out.println();

        for (int row = 0; row < studentDetails.length; row++) {
            System.out.print(getHighestScoringPerCourseIn(studentDetails)[row] + "\t\t\t");
        }

        System.out.println();
        System.out.println("=".repeat(80));
    }

    public static int[] getTotalScorePerStudentOf(int[][] studentDetails) {
        int[] totalArray = new int[studentDetails.length];
        for (int row = 0; row < totalArray.length; row++) {
            int total = 0;
            for (int column = 0; column < studentDetails[row].length; column++) {
                total += studentDetails[row][column];
                totalArray[row] = total;
            }
            position[row] = total;
        }
        return totalArray;
    }

    public static int[] calculatePosition(){
       int highestNumber = position[0];
       int currentPosition = 0;
        for(int j = 0; j < position.length; j++) {
            for(int number : position){
                if(number > highestNumber)
                    highestNumber = number;
            }
            for (int i = 0; i < position.length; i++) {
               if (position[i] == highestNumber) {
                   position[i] = ++currentPosition;
                    highestNumber = position[0];
               }
           }
       }
        return position;
    }
    public static double[] getAverageScorePerStudentOf(int[][] studentDetails) {
        double[] averageArray = new double[studentDetails.length];
        int[] total = getTotalScorePerStudentOf(studentDetails);
        for (int row = 0; row < averageArray.length; row++) {
            averageArray[row] = (double) total[row] / total.length;
        }
        return averageArray;
    }

    public static int[] getTotalScorePerCourseOf(int[][] studentDetails) {
        int[] columnTotalArray = new int[studentDetails.length];
        for (int row = 0; row < columnTotalArray.length; row++) {
            int sum = 0;
            for (int column = 0; column < studentDetails[row].length; column++) {
                sum += studentDetails[column][row];
                columnTotalArray[row] = sum;
            }
        }
        return columnTotalArray;
    }

    public static int[] getHighestScoringPerCourseIn(int[][] studentDetails) {
        int[] indexOfHighest = new int[studentDetails.length];
        int highest = studentDetails[0][0];
        for (int column = 0; column < studentDetails[courseSize].length; column++) {
            for (int row = 0; row < column; row++) {
                if (studentDetails[column][row] > highest) {
                    highest = studentDetails[column][row];
                    indexOfHighest[row] = column + 1;
                }
            }
        }
        return indexOfHighest;
    }

    public static int getBestStudent(int[][] studentDetails) {
        int[] totalArray = getTotalScorePerStudentOf(studentDetails);
        int highestScore = totalArray[0];
        int bestStudent = 1;
        for (int row = 0; row < totalArray.length; row++) {
            if (totalArray[row] > highestScore) {
                highestScore = totalArray[row];
                bestStudent = row + 1;
            }
        }
        return bestStudent;
    }

    public static int getWorstStudent(int[][] studentDetails) {
        int[] totalArray = getTotalScorePerStudentOf(studentDetails);
        int leastScore = totalArray[0];
        int worstStudent = 1;
        for (int row = 0; row < totalArray.length; row++) {
            if (totalArray[row] < leastScore) {
                leastScore = totalArray[row];
                worstStudent = row + 1;
            }
        }
        return worstStudent;
    }
}
