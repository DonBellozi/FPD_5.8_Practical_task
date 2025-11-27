package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void palindromeWorks() {
        assertTrue(StringUtils.isPalindrome("а роза упала на лапу азора"));
        assertFalse(StringUtils.isPalindrome("hello"));
    }

    @Test
    void vowelCountWorks() {
        assertEquals(2, StringUtils.countVowels("hello"));
        assertEquals(0, StringUtils.countVowels(""));
    }

    @Test
    void nullHandling() {
        assertFalse(StringUtils.isPalindrome(null));
        assertEquals(0, StringUtils.countVowels(null));
    }
}
