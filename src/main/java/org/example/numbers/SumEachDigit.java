package org.example.numbers;

public class SumEachDigit {
    private static int sumEachDigit(int n) {
        int number = n;
        int total = 0;
        while (number > 0) {
            total = total + (number % 10);
            number = number / 10;
        }

        return total;
    }
}
