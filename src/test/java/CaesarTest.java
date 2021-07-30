import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarTest {
    @Test
    public void checkInput_checksIfInputIsString() {
        CheckForDigit encrypt = new CheckForDigit();
        assertEquals(false, encrypt.isString("123"));
    }

    @Test
    public void substitute_subsitutesSingleLowerCaseCharacters() {
        Substitute substitute = new Substitute('a', 1);
        assertEquals('b', substitute.forward());
        System.out.println(substitute.forward());
    }
}
