import static org.junit.Assert.assertEquals;

import org.junit.*;

public class RomanNumeralTest {
    private RomanNumeral romanNumeral = new RomanNumeral();

    @Test
    public void testSubtractiveNotationIV() {
        assertEquals(4, romanNumeral.romanToInt("IV"));
    }

    @Test
    public void testWithSubtractiveNotationXIV() {
        assertEquals(14, romanNumeral.romanToInt("XIV"));
    }

    @Test
    public void testWithoutSubtractiveNotationXIV() {
        assertEquals(14, romanNumeral.romanToInt("XIV"));
    }

    @Test
    public void testRepetitionII() {
        assertEquals(2, romanNumeral.romanToInt("II"));
    }

    @Test
    public void testFirstNumberI() {
        assertEquals(1, romanNumeral.romanToInt("I"));
    }

    @Test
    public void testInvalidLetterZ() {
        assertEquals(0, romanNumeral.romanToInt("Z"));
    }

    @Test
    public void testInvalidAndValidLetterXIZ() {
        assertEquals(0, romanNumeral.romanToInt("XIZ"));
    }

    @Test
    public void testNotValidVV() {
        assertEquals(0, romanNumeral.romanToInt("VV"));
    }

    @Test
    public void testNullInput() {
        assertEquals(0, romanNumeral.romanToInt(null));
    }
}
