package me.khun.kata.fundamental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfNumbersRangeTest {

    @Test
    public void Test1()
    {
        assertEquals(-1, SumOfNumbersRange.getSum(0, -1));
        assertEquals(1, SumOfNumbersRange.getSum(0, 1));
        assertEquals(0, SumOfNumbersRange.getSum(-1, 1));
        assertEquals(12, SumOfNumbersRange.getSum(5, -2));
        assertEquals(12, SumOfNumbersRange.getSum(-2, 5));
        assertEquals(-3, SumOfNumbersRange.getSum(-3, -3));
        assertEquals(3, SumOfNumbersRange.getSum(3, 3));

    }
}
