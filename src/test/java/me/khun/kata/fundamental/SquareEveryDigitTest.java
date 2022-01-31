package me.khun.kata.fundamental;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class SquareEveryDigitTest {

    @Test
    public void test() {
        assertEquals(811181, SquareEveryDigit.squareDigits(9119));
        assertEquals(9414, SquareEveryDigit.squareDigits(3212));
        assertEquals(4114, SquareEveryDigit.squareDigits(2112));
        assertEquals(0, SquareEveryDigit.squareDigits(0));
    }

    @Test
    public void randomTest() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int test = 0;
            test += random.nextInt(10);
            test += random.nextInt(10) * 10;
            test += random.nextInt(10) * 10 * 10;
            test += random.nextInt(10) * 10 * 10 * 10;

            assertEquals(SquareEveryDigit.squareDigits(test), SquareEveryDigit.squareDigits(test));

        }
    }

}
