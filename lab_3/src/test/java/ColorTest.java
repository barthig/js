import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColorTest {

    @Test
    void testValidColors() {
        Color color1 = new Color(128, 0, 0, 0.4f);
        Color color2 = new Color(255, 128, 52);
        Color color3 = new Color(0, 255, 0, 0.7f);
        assertNotNull(color1);
        assertNotNull(color2);
        assertNotNull(color3);
    }

    @Test
    void testInvalidRed() {
        assertThrows(IllegalArgumentException.class, () -> new Color(-1, 0, 0, 0.4f));
        assertThrows(IllegalArgumentException.class, () -> new Color(256, 0, 0, 0.4f));
    }

    @Test
    void testInvalidGreen() {
        assertThrows(IllegalArgumentException.class, () -> new Color(0, -1, 0, 0.4f));
        assertThrows(IllegalArgumentException.class, () -> new Color(0, 256, 0, 0.4f));
    }

    @Test
    void testInvalidBlue() {
        assertThrows(IllegalArgumentException.class, () -> new Color(0, 0, -1, 0.4f));
        assertThrows(IllegalArgumentException.class, () -> new Color(0, 0, 256, 0.4f));
    }

    @Test
    void testInvalidAlpha() {
        assertThrows(IllegalArgumentException.class, () -> new Color(0, 0, 0, -0.1f));
        assertThrows(IllegalArgumentException.class, () -> new Color(0, 0, 0, 1.1f));
    }
}
