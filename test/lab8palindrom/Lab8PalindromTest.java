/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8palindrom;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * 
 */

import java.util.Arrays;


class PalindromeUtilsTest {

    @Test
    void getPolindromeFromCollectionTest() {
        String[] params1 = new String[]{ "asd", "22322", "а роза упала на лапу азора", "abccba", "127849ASD", "f0f", "а роза упала на лапу Азора" };
        String[] excpected11 = new String[]{ "22322", "abccba", "f0f"};
        String[] excpected12 = new String[]{ "22322", "abccba", "f0f", "а роза упала на лапу азора"};
        String[] excpected13 = new String[]{ "22322", "а роза упала на лапу азора", "abccba", "f0f", "а роза упала на лапу Азора"};

        String[] params2 = new String[]{ "kek", "asjdkas", "lol", "Lol", "Sum summus mus" };
        String[] excpected21 = new String[]{ "kek", "lol"};
        String[] excpected22 = new String[]{ "kek", "lol", "Lol", "Sum summus mus"};

        String[] params3 = new String[]{ "11111", "sfa893", "hello", "Saippuakivikauppias", "saippuakivikauppias" };
        String[] excpected31 = new String[]{ "11111", "saippuakivikauppias"};
        String[] excpected32 = new String[]{ "11111", "Saippuakivikauppias", "saippuakivikauppias", };

        assertArrayEquals(excpected11, PalindromeUtils.getPolindromeFromCollection(Arrays.asList(params1), true, true).toArray());
        assertArrayEquals(excpected11, PalindromeUtils.getPolindromeFromCollection(Arrays.asList(params1), false, true).toArray());
        assertArrayEquals(excpected12, PalindromeUtils.getPolindromeFromCollection(Arrays.asList(params1), true, false).toArray());
        assertArrayEquals(excpected13, PalindromeUtils.getPolindromeFromCollection(Arrays.asList(params1), false, false).toArray());

        assertArrayEquals(excpected21, PalindromeUtils.getPolindromeFromCollection(Arrays.asList(params2), true, true).toArray());
        assertArrayEquals(excpected22, PalindromeUtils.getPolindromeFromCollection(Arrays.asList(params2), false, true).toArray());
        assertArrayEquals(excpected21, PalindromeUtils.getPolindromeFromCollection(Arrays.asList(params2), true, false).toArray());
        assertArrayEquals(excpected22, PalindromeUtils.getPolindromeFromCollection(Arrays.asList(params2), false, false).toArray());

        assertArrayEquals(excpected31, PalindromeUtils.getPolindromeFromCollection(Arrays.asList(params3), true, true).toArray());
        assertArrayEquals(excpected32, PalindromeUtils.getPolindromeFromCollection(Arrays.asList(params3), false, true).toArray());
        assertArrayEquals(excpected31, PalindromeUtils.getPolindromeFromCollection(Arrays.asList(params3), true, false).toArray());
        assertArrayEquals(excpected32, PalindromeUtils.getPolindromeFromCollection(Arrays.asList(params3), false, false).toArray());
    }

    @Test
    void getPolindromeFromStreamTest() {
        String[] params1 = new String[]{ "asd", "22322","а роза упала на лапу Азора", "abccba", "127849ASD", "f0f", "а роза упала на лапу азора" };
        String[] excpected11 = new String[]{ "22322", "abccba", "f0f"};
        String[] excpected12 = new String[]{ "22322", "abccba", "f0f", "а роза упала на лапу азора"};
        String[] excpected13 = new String[]{ "22322", "а роза упала на лапу азора", "abccba", "f0f", "а роза упала на лапу Азора"};

        String[] params2 = new String[]{ "kek", "asjdkas", "lol", "Lol", "Sum summus mus" };
        String[] excpected21 = new String[]{ "kek", "lol"};
        String[] excpected22 = new String[]{ "kek", "lol", "Lol", "Sum summus mus"};

        String[] params3 = new String[]{ "11111", "POSTAV`TE 3 POJALUISTA", "hello", "Saippuakivikauppias", "saippuakivikauppias" };
        String[] excpected31 = new String[]{ "11111", "saippuakivikauppias"};
        String[] excpected32 = new String[]{ "11111", "Saippuakivikauppias", "saippuakivikauppias", };

        assertArrayEquals(excpected11, PalindromeUtils.getPolindromeFromStream(Arrays.stream(params1), true, true).toArray());
        assertArrayEquals(excpected11, PalindromeUtils.getPolindromeFromStream(Arrays.stream(params1), false, true).toArray());
        assertArrayEquals(excpected12, PalindromeUtils.getPolindromeFromStream(Arrays.stream(params1), true, false).toArray());
        assertArrayEquals(excpected13, PalindromeUtils.getPolindromeFromStream(Arrays.stream(params1), false, false).toArray());

        assertArrayEquals(excpected21, PalindromeUtils.getPolindromeFromStream(Arrays.stream(params2), true, true).toArray());
        assertArrayEquals(excpected22, PalindromeUtils.getPolindromeFromStream(Arrays.stream(params2), false, true).toArray());
        assertArrayEquals(excpected21, PalindromeUtils.getPolindromeFromStream(Arrays.stream(params2), true, false).toArray());
        assertArrayEquals(excpected22, PalindromeUtils.getPolindromeFromStream(Arrays.stream(params2), false, false).toArray());

        assertArrayEquals(excpected31, PalindromeUtils.getPolindromeFromStream(Arrays.stream(params3), true, true).toArray());
        assertArrayEquals(excpected32, PalindromeUtils.getPolindromeFromStream(Arrays.stream(params3), false, true).toArray());
        assertArrayEquals(excpected31, PalindromeUtils.getPolindromeFromStream(Arrays.stream(params3), true, false).toArray());
        assertArrayEquals(excpected32, PalindromeUtils.getPolindromeFromStream(Arrays.stream(params3), false, false).toArray());
    }

    @Test
    void isPalindromeTest() {
        String[] params = new String[]{ "kek", "а роза упала на лапу Азора", "asjdkas", "lol", "Lol", "Sum summus mus" };

        assertEquals(true, PalindromeUtils.isPalindrome(params[0], true, true));

        assertEquals(false, PalindromeUtils.isPalindrome(params[1], true, true));

        assertEquals(true, PalindromeUtils.isPalindrome(params[2], true, true));

        assertEquals(false, PalindromeUtils.isPalindrome(params[3], true, true));
        assertEquals(true, PalindromeUtils.isPalindrome(params[3], false, true));

        assertEquals(false, PalindromeUtils.isPalindrome(params[4], true, true));
        assertEquals(true, PalindromeUtils.isPalindrome(params[4], false, true));
        assertEquals(true, PalindromeUtils.isPalindrome(params[4], false, false));

        assertEquals(false, PalindromeUtils.isPalindrome(params[5], true, true));
        assertEquals(false, PalindromeUtils.isPalindrome(params[5], false, true));
        assertEquals(true, PalindromeUtils.isPalindrome(params[5], false, false));
    }
}
