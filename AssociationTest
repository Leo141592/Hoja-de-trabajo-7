import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssociationTest {

    @Test
    public void testCompareTo() {
        Association<String, String> a1 = new Association<>("apple", "manzana");
        Association<String, String> a2 = new Association<>("banana", "platano");

        assertTrue(a1.compareTo(a2) < 0);
        assertTrue(a2.compareTo(a1) > 0);
    }

    @Test
    public void testGetters() {
        Association<String, String> a =
                new Association<>("dog", "perro");

        assertEquals("dog", a.getKey());
        assertEquals("perro", a.getValue());
    }
}