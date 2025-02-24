package questions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BlockExtraction {

    public static void main(String[] args) {
        // Create a scanner to read input from the user
        Scanner userInputScanner = new Scanner(System.in);

        // Read the dimensions of the matrix from the user
        int numberOfRows = userInputScanner.nextInt();
        int numberOfColumns = userInputScanner.nextInt();

        // Create a 2D array to store the matrix
        int[][] matrix = new int[numberOfRows][numberOfColumns];

        // Read the matrix from the user
        for (int rowIndex = 0; rowIndex < numberOfRows; rowIndex++) {
            for (int columnIndex = 0; columnIndex < numberOfColumns; columnIndex++) {
                matrix[rowIndex][columnIndex] = userInputScanner.nextInt();
            }
        }

        // Read the block identity K from the user
        int targetBlockIdentity = userInputScanner.nextInt();

        // Create a set to store the blocks that need to be removed
        Set<Integer> blocksToRemove = new HashSet<>();

        // Iterate through the matrix to find the target block
        for (int rowIndex = 0; rowIndex < numberOfRows; rowIndex++) {
            for (int columnIndex = 0; columnIndex < numberOfColumns; columnIndex++) {
                // Check if the current block is the target block
                if (matrix[rowIndex][columnIndex] == targetBlockIdentity) {
                    // Add the blocks above the target block to the set
                    for (int aboveRowIndex = 0; aboveRowIndex < rowIndex; aboveRowIndex++) {
                        blocksToRemove.add(matrix[aboveRowIndex][columnIndex]);
                    }
                }
            }
        }

        // Remove the target block itself from the set if present
        blocksToRemove.remove(targetBlockIdentity);

        // Print the number of blocks that need to be removed
        System.out.println(blocksToRemove.size());

        // Close the scanner
        userInputScanner.close();
    }
}