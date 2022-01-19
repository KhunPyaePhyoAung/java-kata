package me.khun.kata.fundamental;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextPerfectSquareTest {

        @Test
        public void test1() {
            assertEquals(144, NextPerfectSquare.findNextSquare(121));
        }

        @Test
        public void test2() {
            assertEquals(676, NextPerfectSquare.findNextSquare(625));
        }

        @Test
        public void test3() {
            assertEquals(-1, NextPerfectSquare.findNextSquare(114));
        }
}
