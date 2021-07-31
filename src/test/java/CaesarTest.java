import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarTest {
    @Test
    public void checkInput_checksIfInputIsString() {
        CheckForDigit value = new CheckForDigit();
        assertEquals(false, value.isString("123"));
    }

    @Test
    public void substitute_substitutesSingleLowerCaseCharacters() {
        Substitute substitute = new Substitute("z", 1);
        assertEquals("a", substitute.forward());
    }

    @Test
    public void substitute_substitutesSentenceLowerCaseCharacters() {
        Substitute substitute = new Substitute("abc", 1);
        assertEquals("bcd", substitute.forward());
    }
}
