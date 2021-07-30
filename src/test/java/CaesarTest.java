import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarTest {
    @Test
    public void checkInput_checksIfInputIsString() {
        Encrypt encrypt = new Encrypt();
        assertEquals(false, encrypt.isString("123"));
    }
}
