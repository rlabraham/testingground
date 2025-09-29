package org.example.misc;

import java.util.Arrays;

public class schwab {
    public String createCsv(int[] numbers) {
        Arrays.sort(numbers);
        StringBuilder sb = new StringBuilder();
        boolean consecutiveParse = false;

        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                sb.append(numbers[i]);
            } else {
                if (numbers[i] - numbers[i - 1] > 1) {
                    sb.append(", " + numbers[i]) ;
                } else {
                        sb.append("-");
                }
            }
        }

        return sb.toString();
    }
}
