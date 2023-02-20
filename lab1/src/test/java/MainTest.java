import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void getname() {
        assertEquals("Спирин Кирилл Павлович", "Спирин Кирилл Павлович");
    }

    @Test
    public void difference() {

        assertEquals(15, 15);
    }

    @Test
    public void sum() {
        assertEquals(9,9);
    }


}