import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.lab.CompteBancaire;

import static org.junit.jupiter.api.Assertions.*;

public class TestCompteBancaire {

    private CompteBancaire cb;

    @BeforeEach
    void setUp() {
        cb = new CompteBancaire(100);
    }

    @Test
    void testDebiter() {
        double s = cb.debiter(50);
        assertEquals(50, s);
    }

    @Test
    void testCrediter() {
        double s = cb.crediter(50);
        assertEquals(150, s);
    }

    @Test
    void testDebiterSoldeInsuffisant() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            cb.debiter(200);
        });
        assertEquals("Solde insuffisant", exception.getMessage());
    }

    @Test
    void testCrediterNegatif() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            cb.crediter(-50);
        });
        assertEquals("Montant négatif", exception.getMessage());
    }
}
