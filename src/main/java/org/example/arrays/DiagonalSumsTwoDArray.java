package org.example.arrays;

public class DiagonalSumsTwoDArray {
    // Given a square matrix mat, return the sum of the matrix diagonals.
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            if (i == mat.length - 1 - i) {
                sum += mat[i][i];
            } else {
                sum += mat[i][i] * mat[i][mat.length - 1 - i];
            }
        }
        return sum;
    }

    public static int primaryDiagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum = sum + mat[i][i];
        }
        return sum;
    }

    public static int secondaryDiagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = mat.length - 1; i > -1; i--) {
            sum = sum + mat[mat.length - 1 - i][i];
        }
        return sum;
    }
}
