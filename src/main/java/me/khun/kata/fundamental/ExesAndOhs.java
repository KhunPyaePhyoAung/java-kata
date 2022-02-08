package me.khun.kata.fundamental;

/**
 * Check to see if a string has the same amount of 'x's and 'o's.
 * The method must return a boolean and be case insensitive.
 * The string can contain any char.
 *
 * Examples input/output:
 *
 * XO("ooxx") => true
 * XO("xooxx") => false
 * XO("ooxXm") => true
 * XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
 * XO("zzoo") => false
 */
public class ExesAndOhs {
    public static boolean getXO (String str) {

        int count = 0;

        for (char c : str.toLowerCase().toCharArray()) {
            switch (c) {
                case 'x':
                    count++;
                    break;
                case 'o':
                    count--;
                    break;
            }
        }

        return count == 0;
    }
}
