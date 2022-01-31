package me.khun.kata.fundamental;

/**
 * Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
 *
 * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
 *
 * Note: The function accepts an integer and returns an integer
 */
public class SquareEveryDigit {

    private static final int BASE = 10;

    public static int squareDigits(int n) {

        if (n < BASE)
            return n * n;

        int digit = n % BASE;
        int square = digit * digit;

        return square + (square < BASE ? BASE : BASE * BASE) * (squareDigits(n / BASE));
    }


}
