package me.khun.kata.fundamental;

import org.junit.Test;

import java.security.SecureRandom;
import java.util.Arrays;

import static org.junit.Assert.*;

public class IsogramsTest {

    static final String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom rnd = new SecureRandom();

    public String randomString( int len ){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }

    @Test
    public void Tests() {
        assertTrue(Isograms.isIsogram("Dermatoglyphics"));
        assertTrue(Isograms.isIsogram("isogram"));
        assertFalse(Isograms.isIsogram("moose"));
        assertFalse(Isograms.isIsogram("isIsogram"));
        assertFalse(Isograms.isIsogram("aba"));
        assertFalse(Isograms.isIsogram("moOse"));
        assertTrue(Isograms.isIsogram("thumbscrewjapingly"));
        assertTrue(Isograms.isIsogram(""));
    }

    @Test
    public void FixedTests() {
        assertTrue(Isograms.isIsogram("Dermatoglyphics"));
        assertTrue(Isograms.isIsogram("isogram"));
        assertFalse(Isograms.isIsogram("moose"));
        assertFalse(Isograms.isIsogram("isIsogram"));
        assertFalse(Isograms.isIsogram("aba"));
        assertFalse(Isograms.isIsogram("moOse"));
        assertTrue(Isograms.isIsogram("thumbscrewjapingly"));
        assertTrue(Isograms.isIsogram(""));
    }

    private static boolean A(String str) {
        str = str.toLowerCase();
        int len = str.length();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }

    @Test
    public void RandomTests() {
        for(int i = 0; i < 101;) {
            String Z = randomString(++i * 10);
            assertEquals(A(Z), Isograms.isIsogram(Z));
        }
    }

}
