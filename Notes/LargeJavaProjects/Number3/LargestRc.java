import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LargestRC{

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int row = ui.nextInt();
        ui.close();
        // Create an n-by-n matrix and fill it with random 0s and 1s
        int[][] matrix = new int[row][row];
        fillMatrix(matrix);

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Find rows and columns with the most 1s
        ArrayList<Integer> Rows = findRowsWithMaxOnes(matrix);
        ArrayList<Integer> Cols = findColsWithMaxOnes(matrix);

        // Print the results of it
        System.out.println("\nRows with the most 1s: " + Rows);
        System.out.println("Columns with the most 1s: " + Cols);
    }

    // Fill the matrix with random 0s and 1s
    private static void fillMatrix(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int x = 0; x < matrix[i].length; x++) {
                matrix[i][x] = random.nextInt(2); // 0 or 1
            }
        }
    }

    // Print the matrix
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Find rows with the most 1s and return their index
    private static ArrayList<Integer> findRowsWithMaxOnes(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int maxOnes = 0;

        for (int i = 0; i < matrix.length; i++) {
            int onesCount = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    onesCount++;
                }
            }

            if (onesCount > maxOnes) {
                maxOnes = onesCount;
                result.clear();
                result.add(i);
            } else if (onesCount == maxOnes) {
                result.add(i);
            }
        }

        return result;
    }

    // Find columns with the most 1s and return their index
    private static ArrayList<Integer> findColsWithMaxOnes(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int maxOnes = 0;

        for (int j = 0; j < matrix[0].length; j++) {
            int onesCount = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    onesCount++;
                }
            }

            if (onesCount > maxOnes) {
                maxOnes = onesCount;
                result.clear();
                result.add(j);
            } else if (onesCount == maxOnes) {
                result.add(j);
            }
        }
        return result;
    }
}