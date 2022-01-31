package me.khun.kata.fundamental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfNumbersRangeTest {

    @Test
    public void Test1() {
        assertEquals(-1, SumOfNumbersRange.getSum(0, -1));
        assertEquals(1, SumOfNumbersRange.getSum(0, 1));
        assertEquals(0, SumOfNumbersRange.getSum(-1, 1));
        assertEquals(12, SumOfNumbersRange.getSum(5, -2));
        assertEquals(12, SumOfNumbersRange.getSum(-2, 5));
        assertEquals(-3, SumOfNumbersRange.getSum(-3, -3));
        assertEquals(3, SumOfNumbersRange.getSum(3, 3));

    }

    @Test
    public void TestPositive() {
        assertEquals(14, SumOfNumbersRange.getSum(5, -1));
        assertEquals(127759, SumOfNumbersRange.getSum(505, 4));
        assertEquals(44178, SumOfNumbersRange.getSum(321, 123));
    }

    @Test
    public void TestNegative() {
        assertEquals(-1275, SumOfNumbersRange.getSum(-50, 0));
        assertEquals(-15, SumOfNumbersRange.getSum(-1, -5));
        assertEquals(-5, SumOfNumbersRange.getSum(-5, -5));
        assertEquals(-127755, SumOfNumbersRange.getSum(-505, 4));
        assertEquals(-44055, SumOfNumbersRange.getSum(-321, 123));
    }

    @Test
    public void TestZero() {
        assertEquals(0, SumOfNumbersRange.getSum(0, 0));
    }

    @Test
    public void TestSwitchMinMax() {
        assertEquals(-15, SumOfNumbersRange.getSum(-5, -1));
        assertEquals(15, SumOfNumbersRange.getSum(5, 1));
    }

    @Test
    public void TestEqual() {
        assertEquals(-17, SumOfNumbersRange.getSum(-17, -17));
        assertEquals(17, SumOfNumbersRange.getSum(17, 17));
    }
}
