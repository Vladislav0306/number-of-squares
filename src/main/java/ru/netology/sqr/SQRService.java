package ru.netology.sqr;


public class SQRService {
    public int numberOfSquares(int lowerLimit, int upperLimit) {
        int count = 0;
        for (int number = 10; number <= 99; number++) {
            if (lowerLimit <= number * number && number * number <= upperLimit) {
                count++;
            }
        }
        return count;
    }
}