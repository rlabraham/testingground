package org.example.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a 0-indexed m x n integer matrix, create a new 0-indexed matrix called answer.
 * Make answer equal to matrix,
 * then replace each element with the value -1 with the maximum element in its respective column.
 */
public class ModifyMatrix {
    public static int[][] modifiedMatrix(int[][] matrix) {
        for (int column = 0; column < matrix[0].length; column++) {
            Set<Integer> replacementRows = new HashSet<>();
            int maxVal = -1;

            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][column] == -1) {
                    replacementRows.add(row);
                } else {
                    maxVal = Math.max(maxVal, matrix[row][column]);
                }
            }

            if (!replacementRows.isEmpty()) {
                for (Integer replacementRow : replacementRows) {
                    matrix[replacementRow][column] = maxVal;
                }
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {-1,0,0,2,2},
                {2,0,0,2,1},
                {4,3,2,1,1},
                {-1,-1,0,2,4},
                {1,0,3,-1,0}
        };

        int[][] result = modifiedMatrix(matrix);
        System.out.println("result");
    }
}
