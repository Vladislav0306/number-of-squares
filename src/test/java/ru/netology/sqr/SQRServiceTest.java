package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SQRServiceTest {

    @Test
    public void sqrtCeil() {
        SQRService service = new SQRService();
        int lowerLimit = 200;
        int upperLimit = 300;
        int expected = 3;
        int actual = service.numberOfSquares(lowerLimit, upperLimit);
        assertEquals(expected, actual);
    }
}