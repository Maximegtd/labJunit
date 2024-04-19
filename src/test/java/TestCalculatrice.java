import org.junit.Before;
import org.lab.Calculatrice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculatrice {

    Calculatrice c = new Calculatrice();

    @Before
    void setUp() {
    }

    @Test
    void testSomme() {
        double s = c.somme(10, 20);
        assertEquals(30, s);
    }

    @Test
    void testProduct() {
        double p = c.product(10, 20);
        assertEquals(200, p);
    }

    @Test
    void testSoustraction() {
        double s = c.soustraction(20, 10);
        assertEquals(10, s);
    }
}
